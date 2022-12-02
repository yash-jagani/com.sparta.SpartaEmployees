package com.sparta.controller;

import com.sparta.logger.LoggerClass;
import com.sparta.model.Employee;

public class Converter {
    //  converts a String array of employees into an EmployeeTree of objects of type Employee
    public static EmployeeTree convertToEmployees(EmployeeTree employeeList, String[] employees) {
        try {
            LoggerClass.logTrace("splitting employee data into parameters for employee objects");
            //  for each employee in the employees String[]
            for (String employee : employees) {
                //  split the data into tokens
                String[] tokens = employee.split(",");
                //  insert new Employee objects taking as parameters the different tokens
                employeeList.insert(new Employee(tokens[0], DateFormat.dateFormatter(tokens[1]), tokens[2], tokens[3], tokens[4], DateFormat.dateFormatter(tokens[1])));
            }
        } catch (Exception e) {
            LoggerClass.logError(e.getMessage());
            throw new RuntimeException(e);
        }
        return employeeList;
    }
}
