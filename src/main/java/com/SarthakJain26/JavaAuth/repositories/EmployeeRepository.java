package com.SarthakJain26.JavaAuth.repositories;

// Repositories provides methods to communicate with the DB using ORM

import com.SarthakJain26.JavaAuth.models.tables.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query("select name from Employee")
    public List<String> findAllNames();

    public Employee findByName(String name);
}
