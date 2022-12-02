# MySQL Employees Project Week 3 - SOLID/OOP
___
### Table of Contents 

[Requirements](#Requirements)  
[Technologies](#Technologies)  
[Frontend](#Frontend)  
[Apache Log4j 2.x Logging](#Apache Log4j 2.x Logging)  
[JUnit 5 Testing](#JUnit 5 Testing)  
[Future Improvements](#Future Improvements)
___

### Requirements

Call ```EmployeeFactory.getEmployees(n)``` to generate an array of random employee data of size ```n (1 <= n <= 1000)```
- Employee data is provided as an array of ```Strings```, returned from ```getEmployees()```, each ```String``` representing
    - ```emp_no``` (up to 8 digits)
    - ```birth_date``` (```YYYY-MM-DD```, ```ISO 8601``` calendar date format)
    - ```first_name``` (alpha characters and spaces only)
    - ```last_name``` (alpha characters and spaces only)
    - ```gender``` (single character)
    - ```hire_date``` (```YYYY-MM-DD```)
- The values for the employee data will be separated by commas within the ```String```
    - For example, ```"1234567,1995-01-23,Teagan,Griffith,F,2012-04-12"```
- Convert each element in the array into an ```Employee``` object, having created a suitable class, and store it in a ```List``` using a suitable concrete type
- Once the provided data have been stored in a ```List```, convert the ```List``` to a binary tree using a class you've created for this purpose (using ```last_name``` as the key)
- Use a nested class to represent a node in the tree
- The tree should allow for multiple employees with the same ```last_name```
- Allow the user to search for a specific employee by ```last_name```
___

### Technologies
- ```SOLID``` and ```OOP``` principles
- ```JUnit``` testing
- ```Collections``` framework
- ```Factory``` design pattern
- ```MVC``` architecture
- Create and use of ```nested class```
- Populate a ```binary tree``` from unsorted data
- Provide a user interface and searching capability
- Using ```interfaces```
___

### Frontend
Wireframe for the front-end design of the program

![Wireframe](http://i.imgur.com/s2BRn5M.png)
___
### Apache Log4j 2.x Logging
___
We used the Apache Log4j 2.19.0 to perform logging and implemented the ```ERROR``` and ```TRACE``` log levels.  

The ```TRACE``` log level provides visibility in the log file for when the program starts, whenever a method is called (and the function it is performing)
and when the program ends.

The ```ERROR``` log level provides visibility in the log file for when there is an ```Exception``` that breaks the flow of the program.
___

### Project Demonstration

![Image](https://i.imgur.com/c2FMdVQ.png)
___

### JUnit 5 Testing

We used JUnit 5.9.0 to perform unit testing on methods to ensure that they work for edge-case inputs  
<br>
e.g. the DateFormatting method
```Java
class DateFormatTest {

    @Test
    @DisplayName("Testing the dateFormatter method to convert MM/dd/YYYY to YYYY-MM-dd")
    void dateFormattingTestWithMMddYYYY() {
        String date1 = "01/02/2019", date2 = "06/15/2017", date3 = "12/07/1999";
        LocalDate expected1 = LocalDate.of(2019, 1, 2), expected2 = LocalDate.of(2017,6,15), expected3 = LocalDate.of(1999,12,7);
        Assertions.assertEquals(expected1, EmployeeFactory.dateFormatter(date1));
        Assertions.assertEquals(expected2, EmployeeFactory.dateFormatter(date2));
        Assertions.assertEquals(expected3, EmployeeFactory.dateFormatter(date3));
    }

    @Test
    @DisplayName("Testing the dateFormatter method to convert M/d/YYYY to YYYY-MM-dd")
    void dateFormatterTestingWithMdYYYY() {
        String date1 = "1/2/2019", date2 = "6/15/2017", date3 = "12/7/1999";
        LocalDate expected1 = LocalDate.of(2019, 1, 2), expected2 = LocalDate.of(2017,6,15), expected3 = LocalDate.of(1999,12,7);
        Assertions.assertEquals(expected1, EmployeeFactory.dateFormatter(date1));
        Assertions.assertEquals(expected2, EmployeeFactory.dateFormatter(date2));
        Assertions.assertEquals(expected3, EmployeeFactory.dateFormatter(date3));
    }
}
```
___



### Future Improvements
- Following the GitHub Workflow closely with a branching strategy to safely experiment with code and avoid merge conflicts.
- Implement a more concrete planning phase 
- asdf
