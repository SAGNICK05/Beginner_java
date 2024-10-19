import java.io.*;

public class firstOccur {
    int index;

    int findStr(String haystring, String needle) {
        int flag = 0;
        int l = needle.length();
        String str;
        for (int i = 0; i < haystring.length() - l; i++) {
            str = haystring.substring(i, i + l);
            if (str.equals(needle) == true) {
                flag = 1;
                index = i;
                break;
            }
        }
        if (flag == 1)
            return 1;
        else
            return 0;
    }

    void display() {

    }

    public static void main(String[] args) throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        firstOccur fo = new firstOccur();
        System.out.println("enter the haystring");
        String haystring = obj.readLine();
        System.out.println("enter the needle");
        String needle = obj.readLine();

        int ch = fo.findStr(haystring, needle);
        if (ch == 1)
            System.out.println("the needle has been found at index--->" + fo.index);
        else
            System.out.println("the needle is not found");

    }
}
