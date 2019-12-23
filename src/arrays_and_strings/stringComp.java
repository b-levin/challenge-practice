package arrays_and_strings;

public class stringComp {

    public static String stringCompression(String word) {
        /*
        Takes the string word and returns the "compressed string"
        ie word = "aabcccccaaa" would return "a2b1c5a3"
         */
        char tmp[] = new char[word.length()];
        char letter = word.charAt(0);
        tmp[0] = letter;
        int charCount = 0;
        int pos = 1;
        for (int i = 0; i < word.length(); i++) {
            char atI = word.charAt(i);
            if (letter == atI) {
                charCount++;
            } else {
                char c = (char)(charCount + '0');
                tmp[pos] = c;
                pos++;
                charCount = 1;
                letter = atI;
                tmp[pos] = letter;
                pos++;
            }
            if (i+1 == word.length()) {
                char c = (char)(charCount + '0');
                tmp[pos] = c;
            }
        }
        String out = new String(tmp);
        if (out.length() <= word.length()) {
            return out;
        } else {
            return word;
        }
    }

    public static void main(String[] args) {
        String s1 = "aabcccccaaa";
        String s2 = stringCompression(s1);
        System.out.println(s2);
    }
}
