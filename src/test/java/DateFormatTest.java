import com.sparta.model.EmployeeFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;


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