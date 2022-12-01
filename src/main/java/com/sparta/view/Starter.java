package com.sparta.view;

import com.sparta.logger.LoggerClass;
import com.sparta.model.Employee;
import com.sparta.model.EmployeeFactory;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;


public class Starter {
    public static void start(){
        LoggerClass.logTrace("program starts here");

        // Start frontend
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the last name to search:");
        // search term to be provided to function
        String search = scanner.next();

        // Pass 'search' to controller and return a collection of results?

        // change this to the collection of results
//        TreeSet results = new TreeSet<>();

        // loop the collection and present output
//        for (int i = 0; i < results.size()-1; i++) {
//            String.format("%d. %s $s (Employee No.: %d) is a %s born on %t and hired on %t",
//            i, results.getFirstName(), results.getLastName, results.getEmployeeNumber, results.getGender, results.getBirthDate, results.getHireDate);
//        }

        // End frontend

        //Main app function
        LoggerClass.logTrace("formatting date");
//        EmployeeFactory.printEmployees(EmployeeFactory.getEmployeeList(998));
        List<Employee> employees = new ArrayList<>(EmployeeFactory.getEmployeeList(998));
//        employees.add(new Employee("10034",LocalDate.parse("12/29/1962"),"Bader","Swan","M",LocalDate.parse("9/21/1988")));
//        employees.add(new Employee("10035", LocalDate.parse("12/29/1962"),"Bader","Swan","M",LocalDate.parse("9/21/1988")));

        System.out.println(EmployeeFactory.getEmployeeByLastName(employees, search));
    }

}
