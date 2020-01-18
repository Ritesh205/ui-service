package com.technovate.uiservice.service;

import com.technovate.uiservice.models.Employee;

import java.util.List;

public interface UiService {

    String verify(String name);

    List<Employee> getAllEmployees();
}
