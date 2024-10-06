package com.example.jdbc.model;

import com.example.jdbc.state.EmployeeState;
import com.example.jdbc.state.ActiveState;

public class Employee {
    private long id;
    private String name;
    private String position;
    private double salary;
    private EmployeeState state;


    public Employee() {
        this.state = new ActiveState(); // Default state
    }


    public Employee(long id, String name, String position, double salary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.state = new ActiveState();
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setState(EmployeeState state) {
        this.state = state;
    }

    public String create() {
        return state.create();
    }

    public String update() {
        return state.update();
    }

    public String delete() {
        return state.delete();
    }
}
