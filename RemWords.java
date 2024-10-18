import java.util.*;
// program to accept any sentence and form a new sentence using only the 
// words which doesn't end with a vowels 
// ---------------------------------------------------------------------
class RemWords
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\n Enter any sentence :");
        String s=sc.nextLine();
        s=s.trim()+" ";
        int len=s.length();
        String str=null,temp=null;
        s=s.toLowerCase();

        for(int i=0;i<len;i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
                temp=temp+ch;
            else
            {
                int ln=temp.length();
                char c=temp.charAt(ln-1);
                if((c=='a' || c=='e' || c=='i' || c=='o' || c=='u'))
                    str=str+temp+" ";
                temp=null;
            }
        }
        System.out.print("\n New sentence is :"+str);
    }
}
