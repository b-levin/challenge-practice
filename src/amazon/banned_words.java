package amazon;

import java.util.*;

public class banned_words {

    /*
    Description:
        Given a paragraph and a list of banned words, return the most frequent word that is not in 
        the list of banned words. 
        It is guaranteed there is at least one word that isn't banned, and that the answer is unique.
        Words in the list of banned words are given in lowercase, and free of punctuation. 
        Words in the paragraph are not case sensitive. The answer is in lowercase. 

    Example:
        Input: 
        paragraph = "Bob hit a ball, the hit BALL flew far after it was hit."
        banned = ["hit"]
        Output: "ball"
    */

    public static String banned(String paragraph, List<String> banList) {
        String[] para = paragraph.split(" ");
        HashMap<String, Integer> paraMap = new HashMap<>();
        for (String word : para) {
            boolean inBanned = false;
            String wordLower = word.toLowerCase();
            for (String bannedWord : banList) {
                if (wordLower.equals(bannedWord)) {
                    inBanned = true;
                    break;
                }
            }
            if (!inBanned) {
                if (paraMap.get(wordLower) == null) {
                    paraMap.put(wordLower, 1);
                } else {
                    paraMap.put(wordLower, paraMap.get(wordLower) + 1);
                }
            }
        }
        int max = 0;
        String out = "";
        for (String word : paraMap.keySet()) {
            int wordVal = paraMap.get(word);
            if (wordVal >= max) {
                max = wordVal;
                out = word;
            }
        }
        return out;
    }

    public static void main(String args[]) {
        String para = "Bob hit a ball, the hit BALL flew far after it was hit.";
        List<String> bannedWords = new ArrayList<>();
        bannedWords.add("hit");
        System.out.println(banned(para, bannedWords));
    }
}