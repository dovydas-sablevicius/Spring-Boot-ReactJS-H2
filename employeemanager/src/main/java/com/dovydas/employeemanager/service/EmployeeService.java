package com.dovydas.employeemanager.service;

import com.dovydas.employeemanager.model.Employee;

import java.util.List;

public interface EmployeeService {

    // Save operation
    public Employee saveEmployee(Employee employee);

    // Read operation
    public List<Employee> getAllEmployees();

    // Save operation - from file
    public List<Employee> saveAll(List<Employee> employeeList);

    // Delete operation - deleteAll
    public void deleteAllEmployees();

}
