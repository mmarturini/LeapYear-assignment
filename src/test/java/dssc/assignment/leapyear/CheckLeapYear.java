package dssc.assignment.leapyear;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckLeapYear {

    private final LeapYear leapYear = new LeapYear();

    @Test
    void is_1_leap() {
        Assertions.assertEquals(false, leapYear.isLeapYear(1));
    }

    @Test
    void is_2_leap() { Assertions.assertEquals(false, leapYear.isLeapYear(2)); }

    @Test
    void is_3_leap() { Assertions.assertEquals(false, leapYear.isLeapYear(3)); }

    @Test
    void is_4_leap() { Assertions.assertEquals(true, leapYear.isLeapYear(4)); }

    @Test
    void is_8_leap() { Assertions.assertEquals(true, leapYear.isLeapYear(8));}
}
