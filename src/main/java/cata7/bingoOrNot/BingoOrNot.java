package cata7.bingoOrNot;

public class BingoOrNot {
    /**
     * https://www.codewars.com/kata/5a1ee4dfffe75f0fcb000145/train/java
     * <p>
     * For this game of BINGO, you will receive a single array of 10 numbers from 1 to 26 as an input. Duplicate numbers within the array are possible.
     * <p>
     * Each number corresponds to their alphabetical order letter (e.g. 1 = A. 2 = B, etc).
     * Write a function where you will win the game if your numbers can spell "BINGO".
     * They do not need to be in the right order in the input array). Otherwise you will lose. Your outputs should be "WIN" or "LOSE" respectively.
     */

    public static String bingo(int[] numberArray) {

        int[] bingo = {2, 9, 14, 7, 15};

        for (int i = 0; i < bingo.length; i++) {
            for (int j = 0; j < numberArray.length; j++) {
                if(bingo[i] == numberArray[j]){
                    return "WIN";
                }
            }
        }
        return "LOSE";
    }

    public static void main(String[] args) {
        System.out.println(bingo(new int[]{21, 13, 2, 7, 5, 14, 7, 15, 9, 10}));
    }
}
