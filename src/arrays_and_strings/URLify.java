package arrays_and_strings;

public class URLify {

    public static char[] UFLify(char[] word) {
        //returns word with all spaces replaced with "%20"
        char[] out = new char[word.length];
        int count = 0;
        for (int i = 0; i < out.length && count < out.length; i++) {
            if (word[i] != ' ') {
                out[count] = word[i];
                count++;
            } else {
                out[count] = '%';
                out[count+1] = '2';
                out[count+2] = '0';
                count += 3;
            }
        }
        return out;
    }

    public static void print_array(char[] in) {
        for (int i = 0 ; i < in.length; i++) {
            System.out.print(in[i]);
        }
    }

    public static void main(String[] args) {
        String s1 = "Hello World  ";
        char[] c1 = s1.toCharArray();
        char[] out = UFLify(c1);
        print_array(out);
    }
}
