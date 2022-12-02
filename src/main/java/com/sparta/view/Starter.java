package com.sparta.view;

import com.sparta.controller.EmployeeFactory;
import com.sparta.controller.EmployeeTree;
import com.sparta.controller.InputValidator;
import com.sparta.logger.LoggerClass;

import java.io.IOException;
import java.util.Scanner;

import static com.sparta.controller.Converter.convertToEmployees;

public class Starter {

    public static void start() {
        Scanner in = new Scanner(System.in);
        LoggerClass.logTrace("starting the program");
        System.out.print("Please enter a number of employees you want to import from 1 to 1000: ");
        String employeeNumberAsString = in.nextLine();
        LoggerClass.logTrace("validating employee number input");
        int numberOfEmployees = InputValidator.employeeNumberValidator(employeeNumberAsString);
        EmployeeTree employees = new EmployeeTree();

        try {
            LoggerClass.logTrace("converting string array of employees to object and inserts them into employee tree");
            convertToEmployees(employees, EmployeeFactory.getEmployeesFromCsv(numberOfEmployees));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //print all employees
        LoggerClass.logTrace("printing list of employees");
        System.out.println("A list with " + numberOfEmployees + " employees:");
        employees.inorder(); //:)
        System.out.println("========================================");
        System.out.print("Please enter the last name you want to search for:\n ");
        String lastNameInput = in.nextLine();

        String lastName = InputValidator.lastNameValidator(lastNameInput);
        LoggerClass.logTrace("validating employee last name");
//pass user search to search function
        employees.employeeSearchByLastName(lastName);
        in.close();
        LoggerClass.logTrace("program has ended");
    }
}
