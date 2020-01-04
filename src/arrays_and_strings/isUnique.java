package arrays_and_strings;

import java.util.*;

public class isUnique {

    public static boolean unique(String word) {
        //Returns true if the function has no repeated chars, false if repeats
        HashMap<Character, Integer> wordList = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char atI = word.charAt(i);
            if (wordList.get(atI) == null) {
                wordList.put(atI, 1);
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(unique("hello"));
        System.out.println(unique("World"));
    }
}
