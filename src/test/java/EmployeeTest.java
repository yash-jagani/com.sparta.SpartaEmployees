import com.sparta.controller.EmployeeFactory;
import com.sparta.model.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class EmployeeTest {

    @Test
    @DisplayName("Get last name method test")
    void getLastNameTest() {
        LocalDate date1 = LocalDate.of(2019, 1, 2), date2 = LocalDate.of(2017,6,15);
        Employee employee1 = new Employee("456" , date1 , "Frank", "Matthews", "M", date2 );
        Employee employee2 = new Employee("987" , date2 , "Ignas", "Stepura", "M", date1 );

        String expected = "Matthews";
        String result = employee1.getLastName();

        Assertions.assertEquals( expected,  result );
    }

    @Test
    @DisplayName("compareTo method test")
    void testEmployeeCompareTo() {

        LocalDate date1 = LocalDate.of(2019, 1, 2), date2 = LocalDate.of(2017,6,15);
        Employee employee1 = new Employee("456" , date1 , "Frank", "Matthews", "M", date2 );
        Employee employee2 = new Employee("987" , date2 , "Ignas", "Amber", "M", date1 );
        Employee employee3 = new Employee("456" , date1 , "Mark", "Matthews", "M", date2 );

        int expected = 0;
        int result = employee3.compareTo(employee1);
        Assertions.assertEquals( expected,  result );

        expected = -1;
        result = employee2.compareTo(employee1);
        Assertions.assertEquals( expected,  result );

        expected = 1;
        result = employee1.compareTo(employee2);
        Assertions.assertEquals( expected,  result );
    }

    @Test
    @DisplayName("compareTo method test")
    void testEmployeeToString() {
        LocalDate date1 = LocalDate.of(2019, 1, 2), date2 = LocalDate.of(2017,6,15);
        Employee employee1 = new Employee("456" , date1 , "Frank", "Matthews", "M", date2 );

        String expected = "456,2019-01-02,Frank,Matthews,M,2017-06-15";
        String result = employee1.toString();
        Assertions.assertEquals( expected,  result );
    }
}
