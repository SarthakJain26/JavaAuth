package com.SarthakJain26.JavaAuth.services;

import com.SarthakJain26.JavaAuth.models.tables.Employee;
import com.SarthakJain26.JavaAuth.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getOneEmployee(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public Employee addEmployee(Employee employee) {
        return  employeeRepository.save(employee);
    }

    public List<String> getAllNames() {
        return employeeRepository.findAllNames();
    }

    public Employee getByName(String name) { return employeeRepository.findByName(name); }

}





