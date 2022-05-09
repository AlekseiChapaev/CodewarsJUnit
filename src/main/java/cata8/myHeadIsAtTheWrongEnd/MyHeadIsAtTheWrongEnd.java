package cata8.myHeadIsAtTheWrongEnd;

public class MyHeadIsAtTheWrongEnd {
    /**
     *  https://www.codewars.com/kata/56f699cd9400f5b7d8000b55/train/java
     *
     *  You're at the zoo... all the meerkats look weird. Something has gone terribly wrong - someone has gone and switched their heads and tails around!
     *
     * Save the animals by switching them back. You will be given an array which will have three values (tail, body, head). It is your job to re-arrange the array so that the animal is the right way round (head, body, tail).
     *
     * Same goes for all the other arrays/lists that you will get in the tests: you have to change the element positions with the same exact logics
     *
     * Simples!
     */

    public static String[] fixTheMeerkat(String[] arr) {
        String[] res = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[(arr.length - 1) - i];
        }

        return res;
    }
}
