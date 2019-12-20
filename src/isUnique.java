import java.util.*;

public class isUnique {

    public static boolean isUnique(String word) {
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
        System.out.println(isUnique("hello"));
        System.out.println(isUnique("World"));
    }
}
