package com.sparta.model;

import com.sparta.logger.LoggerClass;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class EmployeeFactory {
    // returns an array containing numEmployees Strings, each representing an Employee as a row from the CSV file
    // 1 <= numEmployees <= 1000
    // may throw IOExceptions, which need to be dealt with in the client code
    // employees.csv should be in the src/main/resources folder in the project
    public static String[] getEmployeesFromCsv(int numEmployees) throws IOException {
        if (numEmployees < 1 || numEmployees > 1000)
            throw new IllegalArgumentException("Argument 'numEmployees' must be between 1 and 1000");
        String employeeLine;
        List<String> result = new ArrayList<>();
        BufferedReader f = new BufferedReader(new FileReader("src/main/resources/employees.csv"));
        // read all the records from the file and add them to the list
        while ((employeeLine = f.readLine()) != null)
            result.add(employeeLine);
        // randomise
        Collections.shuffle(result);
        // return the first numEmployees values as an array
        return result.subList(0, numEmployees).toArray(new String[0]);
    }

    public static List<Employee> getEmployeeList(int numberOfEmp) {
        LoggerClass.logTrace("get employee list");
        List<Employee> employeeList = new ArrayList<>();
        try {
            String[] employees = EmployeeFactory.getEmployeesFromCsv(numberOfEmp);
            for (String employee : employees) {
                String[] tokens = employee.split(",");
                employeeList.add(new Employee(tokens[0], dateFormatter(tokens[1]), tokens[2], tokens[3], tokens[4], dateFormatter(tokens[1])));
            }
            return employeeList;
        } catch (IOException e) {
            LoggerClass.logError(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public static void printEmployees(List<Employee> employeeList) {
        LoggerClass.logTrace("printing employees");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
    }

    public static LocalDate dateFormatter(String inputDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy", Locale.ENGLISH);
        try {
            return LocalDate.parse(inputDate, formatter);
        } catch (DateTimeParseException e) {
            LoggerClass.logError(e.getMessage());
        }
        return null;
    }

    public static List<Employee> getEmployeeByLastName(List<Employee> employeeSet, String lastName) {
        LoggerClass.logTrace("get employees by last name");
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employeeSet) {
            if (employee.getLastName().equals(lastName)) {
                result.add(employee);
            }
        }
        return result;
    }
}