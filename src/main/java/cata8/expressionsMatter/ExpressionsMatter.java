package cata8.expressionsMatter;

public class ExpressionsMatter {
    /**
     * https://www.codewars.com/kata/5ae62fcf252e66d44d00008e/train/java
     *
     * Task
     * Given three integers a ,b ,c, return the largest number obtained after inserting the following operators and brackets: +, *, ()
     * In other words , try every combination of a,b,c with [*+()] , and return the Maximum Obtained
     * Consider an Example :
     * With the numbers are 1, 2 and 3 , here are some ways of placing signs and brackets:
     *
     * 1 * (2 + 3) = 5
     * 1 * 2 * 3 = 6
     * 1 + 2 * 3 = 7
     * (1 + 2) * 3 = 9
     * So the maximum value that you can obtain is 9.
     */

    public static int expressionsMatter(int a, int b, int c){
        int mult = a * b * c;
        int sum = a + b + c;
        int multS = (a + b) * c;
        int multF = a * (b + c);
        int sumF = a + b * c;
        int sumS = a * b + c;

        int[] numArr = {mult, sum, multS, multF, sumF, sumS};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numArr.length; i++) {
            if(max < numArr[i]){
                max = numArr[i];
            }
        }
        return max;
    }
}
