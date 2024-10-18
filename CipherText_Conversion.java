import java.io.*;
import java.util.*;
public class CipherText_Conversion
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String    :");
        String str=sc.nextLine();
        String st="";
        int l=str.length();
        if(l>3&&l<100)
        {
            for(int i=0;i<l;i++)
            {
                char ch=str.charAt(i);
                if(ch>='A'&&ch<='M'||ch>='a'&&ch<='m')
                {
                    st=st+ (char)(ch+13);
                }
                else if(ch>='N'&&ch<='Z'||ch>='n'&&ch<='z')
                {
                    st=st+ (char)(ch-13);
                }
                else
                {
                    st=st+ch;
                }
            }
            System.out.println("\nThe cipher text is   :\n"+st);
        }
        else
        {
            System.out.println("Invalid Length");
        }
    }
}