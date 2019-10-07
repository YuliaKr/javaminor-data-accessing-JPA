package com.javaminor.accessingDataJPA.Repositories;

import com.javaminor.accessingDataJPA.Models.DbModels.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
