import java.util.Scanner;

class twistedprime
{   
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);  
        int a,n=1,x=2,s=0,p,e; 
        System.out.println("enter a numer");
        a=sc.nextInt();  
        for(p=2;p<a;p++){    
            if(a%p==0)

                n++;  
        }

        if(n==1){
            while(a>0)
            {    
                e=a%10;        
                s=s*10+e;
                n=n/10;     
            }

            for(p=2;p<s;p++){
                if(s%p==0)  
                    x++;
            }
            if(x==2)

                System.out.println("twisted prime");
            else   
                System.out.println("not a twited prinme");
        }else 

            System.out.println("not a prime number");
    }
}