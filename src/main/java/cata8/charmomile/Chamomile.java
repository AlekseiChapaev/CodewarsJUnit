package cata8.charmomile;

public class Chamomile {
    /**
     * https://www.codewars.com/kata/57f24e6a18e9fad8eb000296/train/java
     *
     * Who remembers back to their time in the schoolyard, when girls would take a flower and tear its petals, saying each of the following phrases each time a petal was torn:
     *
     * I love you
     * a little
     * a lot
     * passionately
     * madly
     * not at all
     * When the last petal was torn there were cries of excitement, dreams, surging thoughts and emotions.
     *
     * Your goal in this kata is to determine which phrase the girls would say for a flower of a given number of petals, where nb_petals > 0.
     */

    public static String howMuchILoveYou(int nb_petals) {

        if(nb_petals % 6 == 0) {
            return "not at all";
        } else {
            switch (nb_petals % 6) {
                case 1:
                    return "I love you";
                case 2:
                    return "a little";
                case 3:
                    return "a lot";
                case 4:
                    return "passionately";
                case 5:
                    return "madly";
                default:
                    return "";
            }
        }
    }
}
