package com.example.jdbc.state;

public class InactiveState implements EmployeeState {
    @Override
    public String create() {
        return "Employee cannot be created as it is inactive.";
    }

    @Override
    public String update() {
        return "Employee is now active.";
    }

    @Override
    public String delete() {
        return "Employee is already inactive. Cannot delete.";
    }
}
