package com.dovydas.employeemanager.controller;

import com.dovydas.employeemanager.model.Employee;
import com.dovydas.employeemanager.service.EmployeeService;
import com.univocity.parsers.common.record.Record;
import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.csv.CsvParserSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employee")
@CrossOrigin
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    // Save operation
    @PostMapping("/add")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    // Save operation - from file
    @PostMapping("/upload")
    public String UploadData(@RequestParam("file")MultipartFile file) throws Exception{
        List<Employee> employeeList = new ArrayList<>();
        InputStream inputStream = file.getInputStream();
        CsvParserSettings settings = new CsvParserSettings();
        settings.setHeaderExtractionEnabled(true);
        CsvParser parser = new CsvParser(settings);
        List<Record> parseAllRecords = parser.parseAllRecords(inputStream);
        parseAllRecords.forEach(record -> {
            Employee employee = new Employee();
            employee.setFirst_name(record.getString("first_name"));
            employee.setLast_name(record.getString("last_name"));
            employee.setEmail(record.getString("email"));
            employee.setPhone_number(record.getString("phone_number"));
            employeeList.add(employee);
        });
        // Clears all entries
        employeeService.deleteAllEmployees();
        employeeService.saveAll(employeeList);
        return "File uploaded successfully";
    }

    // Read operation
    @GetMapping("/getAll")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }
}
