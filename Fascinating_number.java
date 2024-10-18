import java.io.*;
class Fascinating_number
{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter a number");
        int n = Integer.parseInt(br.readLine());
        int n2 = n * 2;
        int n3 = n * 3;
        String con = n + "" + n2 + n3;
        boolean found = true;
        for(char i = '1'; i <= '9'; i++){
            int count = 0;
            for(int j = 0; j < con.length(); j++){
                char ch = con.charAt(j);
                if(ch == i)
                    count++;
            }
            if(count > 1 || count == 0){
                found = false;
                break;
            }
        }
        if(found)
            System.out.println(n + " is a fascinating number.");
        else
            System.out.println(n + " is not a fascinating number.");
    }
}