package br.com.sistema.saude.gateways.http.resource;

import br.com.sistema.saude.domains.Covid19;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDate;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Covid19Resource {

  @NotNull
  private Long quantidade;
  @NotBlank
  private String regiao;
  @NotNull
  @JsonFormat(pattern = "dd/MM/yyyy")
  private LocalDate data;

  public Covid19 toDomain() {
    final Covid19 covid19 = new Covid19();
    covid19.setQuantidade(quantidade);
    covid19.setRegiao(regiao);
    covid19.setData(data);
    return covid19;
  }
}