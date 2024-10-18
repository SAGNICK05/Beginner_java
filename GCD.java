import java.util.Scanner;
class GCD
{
    int a,b;
    GCD()
    {
        a=b=0;
    }
     void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
    }
    void greatest()
    {
       if(a<b)
       {
         a=a+b;
         b=a-b;
         b=a-b;
        }
    }
     void display()
    {
        int m=0;
        for(int i=1;i<=a;i++)
           {
             if(a*i==b)
             {
                m=i;
                break;
             }
           }
        System.out.println("greatest common divisor="+m);
    }
    public static void main(String[]args)
    {
        GCD g=new GCD();
        g.accept();
        g.display();
    }
}
            