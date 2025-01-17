package dssc.assignment.leapyear;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CheckLeapYear {

    private final LeapYear leapYear = new LeapYear();

    @ParameterizedTest
    @ValueSource(ints = {1,2,3})
    void not_divisible_by_4(int year) { Assertions.assertEquals(false, leapYear.isLeapYear(year));}

    @ParameterizedTest
    @ValueSource(ints = {4,8,12})
    void divisible_by_4(int year) { Assertions.assertEquals(true, leapYear.isLeapYear(year));}

    @ParameterizedTest
    @ValueSource(ints = {100,200,300,1900})
    void divisible_by_4_and_100(int year) { Assertions.assertEquals(false, leapYear.isLeapYear(year));}

    @ParameterizedTest
    @ValueSource(ints = {400, 800, 2000})
    void divisible_by_4_and_100_and_400(int year) { Assertions.assertEquals(true, leapYear.isLeapYear(year));}

}
