package dssc.assignment.leapyear;

public class LeapYear {

    Boolean isLeapYear(int year) {

        if ( year%4 == 0) {
            if (year%100 == 0) {
                if ( year%400 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        else {
            return false;
        }
    }

    void print(int year) {
        System.out.println(this.isLeapYear(year));
    }
}
