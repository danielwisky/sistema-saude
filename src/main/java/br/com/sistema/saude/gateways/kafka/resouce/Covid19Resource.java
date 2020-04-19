package br.com.sistema.saude.gateways.kafka.resouce;

import br.com.sistema.saude.domains.Covid19;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDate;
import lombok.Data;

@Data
public class Covid19Resource {

  private String codigo;
  private Long quantidade;
  private String regiao;
  @JsonFormat(pattern = "dd/MM/yyyy")
  private LocalDate data;

  public Covid19Resource(final Covid19 covid19) {
    this.codigo = covid19.getId();
    this.quantidade = covid19.getQuantidade();
    this.regiao = covid19.getRegiao();
    this.data = covid19.getData();
  }
}
