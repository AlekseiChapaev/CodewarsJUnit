package cata8.findNumbersWhichAreDivisibleByGivenNumber;

import java.util.List;

public class FindNumbersWhichAreDivisibleByGivenNumber {

    /**
     *  https://www.codewars.com/kata/55edaba99da3a9c84000003b
     *
     *  Complete the function which takes two arguments and returns all numbers which are divisible by the given divisor. First argument is an array of numbers and the second is the divisor.
     *
     * Example(Input1, Input2 --> Output)
     * [1, 2, 3, 4, 5, 6], 2 --> [2, 4, 6]
     */
    public static void main(String[] args) {

    }
    public int[] res(int[] numbers, int divider){
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % divider == 0){
                count++;
            }
        }
        int[] result = new int[count];
        int countRes = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % divider == 0){
                result[countRes] = numbers[i];
                countRes++;
            }
        }

        return result;
    }
}
