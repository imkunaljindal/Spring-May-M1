package com.acciojob.OfficeManagementApp.model;

public class Employee {

    private int empId;
    private String name;
    private int age;
    private String department;
    private int salary;
    private String gender;

    public Employee() {
    }

    public Employee(int empId,
                    String name,
                    int age,
                    String department,
                    int salary,
                    String gender) {
        this.empId = empId;
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
        this.gender = gender;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
