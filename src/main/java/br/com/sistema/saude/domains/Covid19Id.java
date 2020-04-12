package br.com.sistema.saude.domains;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Covid19Id {

  private String regiao;
  private LocalDate data;
}