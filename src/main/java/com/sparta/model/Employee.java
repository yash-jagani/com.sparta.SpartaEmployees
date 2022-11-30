package com.sparta.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeParseException;
import java.util.Date;

public class Employee {

    private String employeeNumber;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD");
    private String birthDate;
    private String firstName;
    private String lastName;
    private String gender;
    private String hireDate;

    public Employee(String employeeNumber, String birthDate, String firstName, String lastName, String gender, String hireDate) {
        this.employeeNumber = employeeNumber;
        this.birthDate = birthDate;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.hireDate = hireDate;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return employeeNumber + "," + birthDate + "," + firstName + "," + lastName + "," + gender + "," + hireDate;
    }
}
