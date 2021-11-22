package dssc.assignment.leapyear;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PrintOnStandardOutput {

    @ParameterizedTest
    @ValueSource(ints = {4, 400, 2000})
    void true_if_leap(int year) {
        ByteArrayOutputStream fakeStandardOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(fakeStandardOutput));

        LeapYear leapYear = new LeapYear();
        leapYear.print(year);
        Assertions.assertEquals(true+System.lineSeparator(), fakeStandardOutput.toString());
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 1900, 2017})
    void false_if_not_leap(int year) {
        ByteArrayOutputStream fakeStandardOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(fakeStandardOutput));

        LeapYear leapYear = new LeapYear();
        leapYear.print(year);
        Assertions.assertEquals(false+System.lineSeparator(), fakeStandardOutput.toString());
    }

}
