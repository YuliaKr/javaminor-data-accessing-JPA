package com.javaminor.accessingDataJPA.Repositories;

import com.javaminor.accessingDataJPA.Models.DbModels.BankAccount;
import org.springframework.data.repository.CrudRepository;

public interface BankAccountRepository extends CrudRepository<BankAccount, Long> {
}
