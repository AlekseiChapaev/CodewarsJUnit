package cata8.calculateAverage;

public class CalculateAverage {
    /**
     * https://www.codewars.com/kata/57a2013acf1fa5bfc4000921/train/java
     *
     * Write a function which calculates the average of the numbers in a given list.
     *
     * Note: Empty arrays should return 0.
     */

    public static double find_average(int[] array){
        if(array.length == 0){
            return 0;
        } else{
            double sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            return sum / array.length;
        }
    }
}
