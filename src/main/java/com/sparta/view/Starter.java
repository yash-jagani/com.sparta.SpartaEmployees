package com.sparta.view;

import com.sparta.model.Converter;
import com.sparta.model.Employee;
import com.sparta.model.EmployeeFactory;

import java.io.IOException;
import java.util.*;

public class Starter {

    public static void start() {
        EmployeeFactory employeeFactory = new EmployeeFactory();
        Set<Employee> employees;
        String[] employeesStrArr;
        try {
            employeesStrArr = EmployeeFactory.getEmployees(1000);

            employees = Converter.convertToEmployees(employeesStrArr);
            employeeFactory.printEmployees(employees);
            System.out.println(employees.size());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
