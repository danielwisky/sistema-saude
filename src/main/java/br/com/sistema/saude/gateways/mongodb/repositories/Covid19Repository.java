package br.com.sistema.saude.gateways.mongodb.repositories;

import br.com.sistema.saude.domains.Covid19;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Covid19Repository extends MongoRepository<Covid19, String> {

}