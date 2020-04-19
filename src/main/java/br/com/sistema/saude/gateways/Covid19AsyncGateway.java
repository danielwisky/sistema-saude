package br.com.sistema.saude.gateways;

import br.com.sistema.saude.domains.Covid19;

public interface Covid19AsyncGateway {

  void enviarCovid(Covid19 covid19);
}
