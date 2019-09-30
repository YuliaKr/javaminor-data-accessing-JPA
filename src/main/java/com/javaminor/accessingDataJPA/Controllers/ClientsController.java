package com.javaminor.accessingDataJPA.Controllers;

import com.javaminor.accessingDataJPA.Models.Client;
import com.javaminor.accessingDataJPA.Repositories.ClientsRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("clients")
public class ClientsController {

    private final ClientsRepository _clientRepository;

    public ClientsController(ClientsRepository clientRepository) {
        _clientRepository = clientRepository;
    }

    @PostMapping(value = "", consumes = "application/json")
    public ResponseEntity SaveEmployee(@RequestBody Client client){
        _clientRepository.save(client);
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
