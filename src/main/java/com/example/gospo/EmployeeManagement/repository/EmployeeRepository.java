package com.example.gospo.EmployeeManagement.repository;

import com.example.gospo.EmployeeManagement.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
