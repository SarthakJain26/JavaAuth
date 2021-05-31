package com.SarthakJain26.JavaAuth.controllers;

import com.SarthakJain26.JavaAuth.models.pojos.EmployeeRequestPayload;
import com.SarthakJain26.JavaAuth.models.tables.Employee;
import com.SarthakJain26.JavaAuth.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
//import javax.validation.constraints.NotNull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/getAll")
    public ResponseEntity<List<Employee>> getEmployees() {
        return ResponseEntity.ok().body(employeeService.getEmployees());
    }

    @GetMapping("/getOne/{id}")
    public ResponseEntity<Employee> getEmployee(
//            @NotNull
            @PathVariable(value="id")
            Long id
    ) {
        return ResponseEntity.ok().body(employeeService.getOneEmployee(id));
    }

    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(
            @RequestBody()
                    EmployeeRequestPayload employeePayload
    ) {
        Employee employee = new Employee();
        employee.setAge(employeePayload.getAge());
        employee.setName(employeePayload.getName());
        return ResponseEntity.ok().body(employeeService.addEmployee(employee));
    }

    @GetMapping("/getAllNames")
    public ResponseEntity<List<String>> getAllNames() {
        return ResponseEntity.ok().body(employeeService.getAllNames());
    }

    @GetMapping("/getByName/{name}")
    public ResponseEntity<Employee> getByName(
            @PathVariable(value="name")
                    String name
    ) {
        return ResponseEntity.ok().body(employeeService.getByName(name));
    }
}


