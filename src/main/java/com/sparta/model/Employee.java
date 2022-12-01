package com.sparta.model;

import java.time.LocalDate;

public class Employee {

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

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
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

//    public List<Employee> getEmployeeByLastName(List<Employee> employeeSet, String lastName) {
//        List<Employee> result = new ArrayList<>();
//        for (Employee employee : employeeSet) {
//            if (employee.getLastName().equals(lastName)) {
//                result.add(employee);
//            }
//        }
//        return result;
//    }


}
