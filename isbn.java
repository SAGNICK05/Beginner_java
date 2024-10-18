import java.io.*;
class isbn
{
    public static void main(String[]args)throws IOException
    {
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number");
        String n=obj.readLine();
        if(n.length()!=15)
          System.out.println("It is not an ISBN number as is not of 15 digits");
        else
        {
            int s=0;
            for(int i=0;i<15;i++)
            {
                char c=n.charAt(i);
                String cd=Character.toString(c);
                int nb=Integer.parseInt(n);
                s+=(i+1)*nb;
            }
            if(s%11==0)
            System.out.println("ISBN number");
            else
            System.out.println("It is not an ISBN number");
        }
    }
}