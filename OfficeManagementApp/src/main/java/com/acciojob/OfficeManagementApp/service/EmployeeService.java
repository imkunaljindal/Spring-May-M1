package com.acciojob.OfficeManagementApp.service;

import com.acciojob.OfficeManagementApp.model.Employee;
import com.acciojob.OfficeManagementApp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public void addEmployee(Employee employee) {
        employeeRepository.addEmployee(employee);
    }

    public Employee getEmployee(int empId) {
        return employeeRepository.getEmployee(empId);
    }

    public void deleteEmployee(int empId) {
        employeeRepository.deleteEmployee(empId);
    }

    public Employee updateSalary(int empId, int newSalary) {
        return employeeRepository.updateSalary(empId,newSalary);
    }
}
