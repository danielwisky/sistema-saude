package br.com.sistema.saude.gateways.http;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import br.com.sistema.saude.gateways.http.resource.Covid19Resource;
import br.com.sistema.saude.usecases.RegistrarCovid19;
import io.swagger.annotations.ApiOperation;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/covid19")
public class Covid19Controller {

  private final RegistrarCovid19 registrarCovid19;

  @PostMapping(produces = APPLICATION_JSON_VALUE)
  @ApiOperation(value = "Registrar casos de covid19")
  @ResponseStatus(OK)
  public ResponseEntity registrarCovid19(
      @RequestBody @Valid final Covid19Resource covid19Resource) {
    registrarCovid19.execute(covid19Resource.toDomain());
    return ResponseEntity.ok().build();
  }
}