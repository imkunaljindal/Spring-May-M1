package com.acciojob.OfficeManagementApp.repository;

import com.acciojob.OfficeManagementApp.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class EmployeeRepository {

    // hashmap as my db
    Map<Integer, Employee> empDb = new HashMap<>();

    public void addEmployee(Employee employee) {
        empDb.put(employee.getEmpId(),employee);
    }

    public Employee getEmployee(int empId) {
        return empDb.get(empId);
    }

    public void deleteEmployee(int empId) {
        empDb.remove(empId);
    }

    public Employee updateSalary(int empId, int newSalary) {
        Employee employee = empDb.get(empId);
        employee.setSalary(newSalary);
        return employee;
    }
}
