package com.example.jdbc.state;

public class ActiveState implements EmployeeState {
    @Override
    public String create() {
        return "Employee is already active. Cannot create.";
    }

    @Override
    public String update() {
        return "Employee is updated successfully.";
    }

    @Override
    public String delete() {
        return "Employee is now inactive.";
    }
}
