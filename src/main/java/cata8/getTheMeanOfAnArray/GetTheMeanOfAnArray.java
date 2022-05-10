package cata8.getTheMeanOfAnArray;

public class GetTheMeanOfAnArray {
    /**
     * https://www.codewars.com/kata/563e320cee5dddcf77000158/train/java
     *
     * It's the academic year's end, fateful moment of your school report. The averages must be calculated. All the students come to you and entreat you to calculate their average for them. Easy ! You just need to write a script.
     *
     * Return the average of the given array rounded down to its nearest integer.
     *
     * The array will never be empty.
     */

    public static int getAverage(int[] marks){
        if(marks != null && marks.length > 0){
            int sum = 0;
            for (int i = 0; i < marks.length; i++) {
                sum += marks[i];
            }
            return sum / marks.length;
        }
        return 0;
    }
}
