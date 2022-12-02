package com.sparta.controller;

import java.util.Scanner;

public class InputValidator {

    private static Scanner in = new Scanner(System.in);

    public static int employeeNumberValidator(String input) {
        while (!String.valueOf(input).matches("^([1-9][0-9]{0,2}|1000)$")) {
            System.out.println("Input invalid, enter again: ");
            input = in.nextLine();
        }
        return Integer.parseInt(input);
    }

    public static String lastNameValidator(String input) {
        while (!input.matches("[a-zA-Z]*")) {
            System.out.println("Please input a valid lastname or try again.");
            input = in.next().toLowerCase();
        }
        return input;
    }
}
