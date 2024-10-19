import java.io.*;

public class repeatString {
    public static void main(String[] args) throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the string");
        String str = obj.readLine();
        int p = 1, l = 0, flag = 0;
        String s = "", ns = "";
        while (p < str.length() - 2) {
            s = str.substring(0, p);
            l = s.length();
            ns = str.substring(p, p + l);
            if (s.compareTo(ns) == 0) {
                flag = 1;
                break;
            } else
                p++;
        }
        System.out.println();
        if (flag == 1)
            System.out.println("the word has repepition");
        else
            System.out.println("the word doesnt have repepition");
    }
}
