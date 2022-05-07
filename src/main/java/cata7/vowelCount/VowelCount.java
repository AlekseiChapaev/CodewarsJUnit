package cata7.vowelCount;

public class VowelCount {
    /**
     * https://www.codewars.com/kata/54ff3102c1bad923760001f3v
     *
     * Return the number (count) of vowels in the given string.
     *
     * We will consider a, e, i, o, u as vowels for this Kata (but not y).
     *
     * The input string will only consist of lower case letters and/or spaces.
     */

    public static int getCount(String str) {
        int vowelsCount = 0;
        String newStr = str.replaceAll(" ", "");
        for (int i = 0; i < newStr.length(); i++) {
            if(newStr.charAt(i) == 'a'
                    || newStr.charAt(i) == 'e'
                    || newStr.charAt(i) == 'i'
                    || newStr.charAt(i) == 'o'
                    || newStr.charAt(i) == 'u'
            ){
                vowelsCount++;
            }
        }

        return vowelsCount;
    }
}
