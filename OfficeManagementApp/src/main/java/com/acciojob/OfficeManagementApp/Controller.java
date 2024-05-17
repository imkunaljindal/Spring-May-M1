package com.acciojob.OfficeManagementApp;

import org.springframework.web.bind.annotation.*;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

@RestController
public class Controller {
    // hashmap as my db
    Map<Integer, Employee> empDb = new HashMap<>();

    @PostMapping("/add-employee")
    public String addEmployee(@RequestBody Employee employee) {
        empDb.put(employee.getEmpId(), employee);
        return "Employee registered successfully!!";
    }

    @GetMapping("/get-employee")
    public Employee getEmployee(@RequestParam("id") int empId) {
        return empDb.get(empId);
    }

    // delete an employee
    @DeleteMapping("/delete-employee/{id}")
    public String deleteEmployee(@PathVariable("id") int empId) {
        empDb.remove(empId);
        return "Employee deleted successfully";
    }

    // update the salary of the employee -> id, new salary

    // APIs for manager similar to employee
}
