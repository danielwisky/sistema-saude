package br.com.sistema.saude.usecases;

import br.com.sistema.saude.domains.Covid19;
import br.com.sistema.saude.gateways.Covid19DatabaseGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RegistrarCovid19 {

  private final Covid19DatabaseGateway covid19DatabaseGateway;

  public void execute(final Covid19 covid19) {
    covid19DatabaseGateway.save(covid19);
  }
}