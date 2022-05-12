package cata7.simpleStringCharacters;

import java.util.Arrays;

/**
 * https://www.codewars.com/kata/5a29a0898f27f2d9c9000058/train/java
 *
 * In this Kata, you will be given a string and your task will be to return a list of ints detailing the count of uppercase letters, lowercase, numbers and special characters, as follows.
 *
 * Solve("*'&ABCDabcde12345") = [4,5,5,3].
 * --the order is: uppercase letters, lowercase, numbers and special characters.
 * More examples in the test cases.
 *
 * Good luck!
 */

public class SimpleStringCharacters {

    public static int[] solve(String word) {
        char[] arr = word.toCharArray();
        int[] resArr = new int[4];
        int countUpperLetters = 0;
        int countLowerLetters = 0;
        int countDigits = 0;
        int countSymbols = 0;
        for (int i = 0; i < arr.length; i++) {

            if(arr[i] >= 65 &&  arr[i] <= 90){
                countUpperLetters++;
            }
            resArr[0] = countUpperLetters;

            if(arr[i] >= 97 &&  arr[i] <= 122){
                countLowerLetters++;
            }
            resArr[1] = countLowerLetters;

            if(arr[i] >= 48 &&  arr[i] <= 57){
                countDigits++;
            }
            resArr[2] = countDigits;

                    if(arr[i] >= 32 && arr[i] <= 47 || arr[i] >= 58 && arr[i] <= 64 || arr[i] >= 91 && arr[i] <= 96 || arr[i] >= 123 && arr[i] <= 127){
                countSymbols++;
            }
            resArr[3] = countSymbols;
        }

        return resArr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve("CbgA5<1d-tOwUZ/*-TS8yQ")));
    }
}