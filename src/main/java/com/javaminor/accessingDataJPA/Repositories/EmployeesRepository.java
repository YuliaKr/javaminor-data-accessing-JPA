package com.javaminor.accessingDataJPA.Repositories;

import com.javaminor.accessingDataJPA.Models.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeesRepository extends CrudRepository<Employee, Long> {
}
