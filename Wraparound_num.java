import java.util.*;
class Wraparound_num
{
    static int count;
    static int n2;
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number:");
        int n=sc.nextInt();
        Wraparound_num ob=new Wraparound_num();
        ob.accept(n);
    }
    static void accept(int a){
        Scanner in=new Scanner(System.in);
        count=0;
        if(a==0)
            System.exit(0);
        for(int i=a;i>0;i/=10)
            count++;       
        if(isWrap(a,count))
            System.out.println("Wraparound number");
        else
            System.out.println("Not Wraparound number");
        System.out.println("Please enter a number:");
        n2=in.nextInt();
        accept(n2);
    }
    
    static boolean isWrap(int x,int max){
         int digits[]=new int[max];
        int check[]=new int[max];
        int fd=x/((int)(Math.pow(10,max-1)));
        int ld=fd;
        int temp=x;
        for(int i=max-1;i>=0;i--){
            digits[i]=temp%10;
            check[i]=temp%10;
            temp=temp/10;
        }
        int current=0;
        do{
            ld=digits[current];            
            current=current+ld;
            if(current>=max){
                current=current%(max);
            }
            if(check[current]==-999)
                return false;
            check[current]=-999;            
        }while(current!=0);       
        for(int i=1;i<max;i++){
            if(check[i]!=-999)
                return false;
        }
        return true;
    }
}