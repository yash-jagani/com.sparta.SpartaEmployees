package com.sparta.view;

import com.sparta.model.Employee;
import com.sparta.model.EmployeeFactory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Starter {

    public static void start(){
        List< Employee> employeeList = new ArrayList<>();
        try {
            String[] employees = EmployeeFactory.getEmployees(6);
            for(String employee : employees) {
                String[] tokens = employee.split(",");

                employeeList.add(new Employee(tokens[0],tokens[1],tokens[2],tokens[3],tokens[4],tokens[5]));

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (Employee emp : employeeList){
            System.out.println(emp);
        }
    }
}
