package dssc.assignment.leapyear;

public class LeapYear {

    boolean isLeapYear(int year) {

        if ( year%4 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
