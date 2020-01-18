package com.technovate.uiservice.repositories;

import com.technovate.uiservice.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
