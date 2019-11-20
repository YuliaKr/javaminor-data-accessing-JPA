package com.javaminor.accessingDataJPA.Repositories;

import com.javaminor.accessingDataJPA.Models.DbModels.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Long> {
    Client findById(long id);

    Client findByUsername(String username);
}
