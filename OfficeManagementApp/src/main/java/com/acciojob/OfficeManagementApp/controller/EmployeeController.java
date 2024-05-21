package com.acciojob.OfficeManagementApp.controller;

import com.acciojob.OfficeManagementApp.model.Employee;
import com.acciojob.OfficeManagementApp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/add-employee")
    public String addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
        return "Employee registered successfully!!";
    }

    @GetMapping("/get-employee")
    public Employee getEmployee(@RequestParam("id") int empId) {
        return employeeService.getEmployee(empId);
    }

    // delete an employee
    @DeleteMapping("/delete-employee/{id}")
    public String deleteEmployee(@PathVariable("id") int empId) {
        employeeService.deleteEmployee(empId);
        return "Employee deleted successfully";
    }

    // update the salary of the employee -> id, new salary
    @PutMapping("/update-salary")
    public Employee updateSalary(@RequestParam("id") int empId,
                                 @RequestParam("new-salary") int newSalary) {
        return employeeService.updateSalary(empId, newSalary);
    }

    // employee with the highest salary
    @GetMapping("/get-highest-salary")
    public Employee getHighestSalaryEmp() {
        return employeeService.getHighestSalaryEmp();
    }
}
