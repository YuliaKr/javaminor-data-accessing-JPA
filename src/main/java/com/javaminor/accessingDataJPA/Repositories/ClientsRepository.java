package com.javaminor.accessingDataJPA.Repositories;

import com.javaminor.accessingDataJPA.Models.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientsRepository extends CrudRepository<Client, Long> {
    Client findById(long id);
}
