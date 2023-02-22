package com.dovydas.employeemanager.service;

import com.dovydas.employeemanager.model.Employee;
import com.dovydas.employeemanager.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    // Save operation
    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    // Read operation
    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // Save operation - from file
    @Override
    public List<Employee> saveAll(List<Employee> employeeList) {
        return employeeRepository.saveAll(employeeList);
    }

    // Delete operation - deleteAll
    public void deleteAllEmployees() {
        employeeRepository.deleteAll();
    }
}
