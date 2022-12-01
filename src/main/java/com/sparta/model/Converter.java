package com.sparta.model;

import java.util.Set;
import java.util.TreeSet;

public class Converter {
    public static Set<Employee> convertToEmployees (String[] employees) {
        Set<Employee> employeeList = new TreeSet<>();

        try {
            for (String employee : employees) {
                String[] tokens = employee.split(",");

                employeeList.add(new Employee(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4], tokens[5]));

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return employeeList;
    }
}
