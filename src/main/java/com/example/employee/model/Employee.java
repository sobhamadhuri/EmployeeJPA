/*
 * You can use the following import statements
 * import javax.persistence.*;
 * import java.util.List;
 * 
 */

// Write your code here
package com.example.employee.model;

import javax.persistence.*;


@Entity
@Table(name = "employeelist")
public class Employee{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="employeeid")
    private int employeeId;

    @Column(name="employeename")
    private String employeeName;

    @Column(name="email")
    private String email;

    @Column(name="department")
    private String department;

    

    public Employee(int employeeId, String employeeName, String email, String department){ // Intializing the attributes using constructor
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.email = email;
        this.department = department;
    }

    public Employee(){} 

    public void setEmployeeId(int employeeId){ //setters
        this.employeeId = employeeId;
    }

    public int getEmployeeId(){ //getters
        return employeeId;
    }

    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }

    public String getEmployeeName(){ 
        return employeeName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){ 
        return email;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public String getDepartment(){
        return department;
    }

    
}
