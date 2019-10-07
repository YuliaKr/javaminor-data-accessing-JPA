package com.javaminor.accessingDataJPA.Controllers;

import com.javaminor.accessingDataJPA.Models.DbModels.Client;
import com.javaminor.accessingDataJPA.Repositories.ClientRepository;
import com.javaminor.accessingDataJPA.Repositories.EmployeeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("employees")
public class EmployeeController {
    private final ClientRepository _clientRepository;
    private final EmployeeRepository _employeeRepository;

    public EmployeeController(ClientRepository clientRepository, EmployeeRepository employeeRepository) {
        _clientRepository = clientRepository;
        _employeeRepository = employeeRepository;
    }
}
