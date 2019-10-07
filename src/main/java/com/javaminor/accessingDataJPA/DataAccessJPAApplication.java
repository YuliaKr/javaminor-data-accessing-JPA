package com.javaminor.accessingDataJPA;

import com.javaminor.accessingDataJPA.Models.DbModels.AddressEmbeddable;
import com.javaminor.accessingDataJPA.Models.DbModels.BankAccount;
import com.javaminor.accessingDataJPA.Models.DbModels.Client;
import com.javaminor.accessingDataJPA.Models.DbModels.CredentialsCommon;
import com.javaminor.accessingDataJPA.Repositories.BankAccountRepository;
import com.javaminor.accessingDataJPA.Repositories.ClientRepository;
import com.javaminor.accessingDataJPA.Repositories.EmployeeRepository;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DataAccessJPAApplication {

	private static final Logger log = LoggerFactory.getLogger(DataAccessJPAApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(DataAccessJPAApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(ClientRepository _clientRepo, BankAccountRepository _accountRepo, EmployeeRepository _employeeRepo) {
		return (args) -> {
			// save a few customers

			//create data
			AddressEmbeddable mockAddress = new AddressEmbeddable("NL", "Rotterdam", "1000AB", "Wijnhaven", "107", null);


			_clientRepo.save(new Client(mockAddress, "test", "welcome123"));
			_clientRepo.save(new Client(mockAddress, "test2", "welcome1234"));
			_clientRepo.save(new Client(mockAddress, "test3", "welcome12345"));

			BankAccount mockAccount = new BankAccount(50.00);
			_accountRepo.save(mockAccount);


			// fetch all customers
			log.info("Clients found with findAll():");
			log.info("-------------------------------");
			for (Client client : _clientRepo.findAll()) {
				log.info(client.toString());
			}
			log.info("");

			// fetch an individual customer by ID
			Client client = _clientRepo.findById(1L);
			log.info("Client found with findById(1L):");
			log.info("--------------------------------");
			log.info(client.toString());
			log.info("");

			// fetch customers by last name
			log.info("Customer found with findByUsername ('test'):");
			log.info("--------------------------------------------");
			Client clientUsername = _clientRepo.findByUsername("test");
			log.info(clientUsername.toString());
			log.info("");
		};
	}
}
