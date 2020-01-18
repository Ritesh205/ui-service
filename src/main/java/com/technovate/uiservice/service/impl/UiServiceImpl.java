package com.technovate.uiservice.service.impl;

import com.technovate.uiservice.models.Employee;
import com.technovate.uiservice.repositories.EmployeeRepository;
import com.technovate.uiservice.service.UiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UiServiceImpl implements UiService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public String verify(String name) {
        return "HELLO "+name+" FROM UI-SERVICE";
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
