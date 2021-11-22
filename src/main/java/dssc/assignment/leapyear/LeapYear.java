package dssc.assignment.leapyear;

public class LeapYear {

    boolean isLeapYear(int year) {

        if ( year%4 == 0) {
            if (year%100 == 0) {
                return false;
            }
            return true;
        }
        else {
            return false;
        }
    }
}
