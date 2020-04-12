package br.com.sistema.saude.gateways;

import br.com.sistema.saude.domains.Covid19;

public interface Covid19DatabaseGateway {

  void save(Covid19 covid19);
}