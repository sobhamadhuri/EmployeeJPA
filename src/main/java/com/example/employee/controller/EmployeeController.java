/*
 * You can use the following import statements
 *
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 */

// Write your code here
package com.example.employee.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.*;


import org.springframework.beans.factory.annotation.Autowired;
import com.example.employee.model.Employee;
import com.example.employee.service.EmployeeJpaService;

@RestController
public class EmployeeController{

    @Autowired // Injecting dependencies
    public EmployeeJpaService employeeService;


    @GetMapping("/employees") //Methods is telling what crud operations it should be done
    public ArrayList<Employee> getEmployees(){
        return employeeService.getEmployees();
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployeeById(@PathVariable("employeeId") int employeeId){
        return employeeService.getEmployeeById(employeeId);

    }

    @PutMapping("/employees/{employeeId}")
    public Employee updateEmployee(@PathVariable("employeeId") int employeeId, @RequestBody Employee employee){
        return employeeService.updateEmployee(employeeId, employee);
    }

    @DeleteMapping("/employees/{employeeId}")
    public void deleteEmployee(@PathVariable("employeeId") int employeeId){
        employeeService.deleteEmployee(employeeId);
    }
}
