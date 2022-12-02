package com.sparta.model;

import java.time.LocalDate;

public class Employee implements Comparable<Employee> {

    private String employeeNumber;
    private LocalDate birthDate;
    private String firstName;
    private String lastName;
    private String gender;
    private LocalDate hireDate;

    public Employee(String employeeNumber, LocalDate birthDate, String firstName, String lastName, String gender, LocalDate hireDate) {
        this.employeeNumber = employeeNumber;
        this.birthDate = birthDate;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.hireDate = hireDate;
    }

    public String getLastName() {
        return lastName.toLowerCase();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return employeeNumber + "," + birthDate + "," + firstName + "," + lastName + "," + gender + "," + hireDate;
    }

    @Override
    public int compareTo(Employee o) {
        if (this.getLastName().compareTo(o.getLastName()) < 0) {
            return -1;
        } else if (this.getLastName().compareTo(o.getLastName()) > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
