import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class longSubS {
    String s = "";

    void accept() throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the string");
        s = obj.readLine();
    }

    boolean isPallin(String s) {
        String ns = "";
        for (int i = s.length() - 1; i >= 0; i--)
            ns += s.charAt(i);
        if (s.compareTo(ns) == 0)
            return true;
        else
            return false;
    }

    void longPallin() {
        String subs = "", finalS = "";
        int flag = 0;
        for (int i = 1; i < s.length(); i++) {
            subs = s.substring(0, i);
            if (isPallin(subs) == true) {
                flag = 1;
                if (subs.length() > finalS.length())
                    finalS = subs;
            }
        }
        if (flag == 0)
            System.out.println("cannot find any pallindromic word");
        else
            System.out.println("the longest pallindromic word is--->" + finalS);
    }

    public static void main(String[] args) throws IOException {
        longSubS ls = new longSubS();
        ls.accept();
        ls.longPallin();
    }
}
