package com.javaminor.accessingDataJPA.Controllers;

import com.javaminor.accessingDataJPA.Models.DbModels.Client;
import com.javaminor.accessingDataJPA.Repositories.ClientRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("clients")
public class ClientController {

    private final ClientRepository _clientRepository;

    public ClientController(ClientRepository clientRepository) {
        _clientRepository = clientRepository;
    }

    @PostMapping(value = "", consumes = "application/json")
    public ResponseEntity SaveEmployee(@RequestBody Client client){
        _clientRepository.save(client);
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
