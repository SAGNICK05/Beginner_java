import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class alterMerge {
    public static String MergeAlternate(String word1, String word2) {
        String newString = "";
        int min = Math.min(word1.length(), word2.length());
        for (int i = 0; i < min; i++) {
            newString += word1.charAt(i);
            newString += word2.charAt(i);
        }
        if (word1.length() > word2.length())
            newString += word1.substring(min, word1.length());
        else
            newString += word2.substring(min, word2.length());
        return (newString);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the first word");
        String word1 = obj.readLine();
        System.out.println("enter the second word");
        String word2 = obj.readLine();
        String ns = MergeAlternate(word1, word2);
        System.out.println("the new String is--->" + ns);
    }
}
