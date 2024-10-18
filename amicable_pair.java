
import java.util.Scanner;
class amicable_pair{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        System.out.println("enter another number");
        int b=sc.nextInt();
        int s=0,s2=0,c;
        for (c=1;c<=a;c++)
        {
            if(a%c==0)
            s+=c;
        }
        for(c=1;c<=b;c++)
        {
            if(b%c==0)
            s2+=c;
        }
        if(s==b&&s2==a)
        System.out.println("amicable pair");
        else
        System.out.println("not an amicable paair");
    }
}