package br.com.sistema.saude.domains;

import java.time.LocalDate;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("covid19")
public class Covid19 {

  @Id
  private String id;
  private Long quantidade;
  private String regiao;
  private LocalDate data;
}