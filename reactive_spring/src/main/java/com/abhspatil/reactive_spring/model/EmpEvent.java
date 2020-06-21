package com.abhspatil.reactive_spring.model;

import java.util.Date;

public class EmpEvent {

    private Employee employee;
    private Date date;

    public EmpEvent(Employee employee, Date date) {
        this.employee = employee;
        this.date = date;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
