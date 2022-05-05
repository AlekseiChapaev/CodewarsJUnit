package centuryFromYear;

public class CenturyFromYear {
    /**
     * https://www.codewars.com/kata/5a3fe3dde1ce0e8ed6000097
     * <p>
     * Introduction
     * The first century spans from the year 1 up to and including the year 100, the second century - from the year 101 up to and including the year 200, etc.
     * <p>
     * Task
     * Given a year, return the century it is in.
     * <p>
     * Examples
     * 1705 --> 18
     * 1900 --> 19
     * 1601 --> 17
     * 2000 --> 20
     */

    public static int century(int number) {
        if (number % 100 > 0) {
            return number / 100 + 1;
        } else{
            return number / 100;
        }
    }
}
