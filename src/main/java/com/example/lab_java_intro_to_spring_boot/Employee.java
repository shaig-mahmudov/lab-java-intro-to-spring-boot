package com.example.lab_java_intro_to_spring_boot;

public class Employee {
    private Long id;
    private String department;
    private String name;
    private Status status;

    public Employee(Long id, String department, String name, Status status) {
        this.department = department;
        this.id = id;
        this.name = name;
        this.status = Status.ON;
    }

    public Employee() {

    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
