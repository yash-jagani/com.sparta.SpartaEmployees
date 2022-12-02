package com.sparta.controller;

import com.sparta.logger.LoggerClass;
import com.sparta.model.Employee;

public class EmployeeTree {
    //  nested class of EmployeeNode
    private static class EmployeeNode {
        Employee key;
        EmployeeNode left, right;

        //  node constructor
        public EmployeeNode(Employee item) {
            key = item;
            left = right = null;
        }

        //  method to get the Employee object instance
        public Employee getKey() {
            return this.key;
        }
    }

    EmployeeNode root;

    //  constructor initializing an EmployeeTree's root to null
    public EmployeeTree() {
        root = null;
    }

    //  insert method for an Employee object
    void insert(Employee key) {
        //  root takes a recursive method for inserting an Employee into the Tree
        root = insertRec(root, key);
    }

    EmployeeNode insertRec(EmployeeNode root, Employee key) {
        //  if the tree is empty, make this Employee root
        if (root == null) {
            root = new EmployeeNode(key);
            return root;
            //  if the Employee comes before the root alphabetically or is equivalent
        } else if (key.compareTo(root.key) <= 0) {
            //  set it to the left
            root.left = insertRec(root.left, key);
            //  otherwise set it to the right
        } else if (key.compareTo(root.key) > 0) {
            root.right = insertRec(root.right, key);
        }

        return root;
    }

    public void search(EmployeeNode root, String key) {
        LoggerClass.logTrace("searching for match");
        //  for the sake of clarity
        String nodeLastName = root.key.getLastName();

        //  if the node's lastName is equal to the key (last name argument)
        if (nodeLastName.compareTo(key) == 0) {
            LoggerClass.logTrace("match found");
            //  return the Employee as a string
            LoggerClass.logTrace("printing data of matching employee(s)");
            System.out.println(root.getKey());
        }

        //  if the node's lastName comes before or is equal to the key
        if (root.left != null && nodeLastName.compareTo(key) >= 0) {
            LoggerClass.logTrace("searching left");
            //  keep going down the left branch
            search(root.left, key);
            //  otherwise the right branch
        } else if (root.right != null && nodeLastName.compareTo(key) < 0) {
            LoggerClass.logTrace("searching right");
            search(root.right, key);
        }
    }

    //  method call to print the tree elements in order
    public void inorder() {
        inorderRec(root);
    }

    //  method call that parses the tree and displays its elements
    void inorderRec(EmployeeNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }

    //  better method that searches from the root down for an employee with the same lastName
    public void employeeSearchByLastName(String lastName) {
        search(root, lastName);
    }
}
