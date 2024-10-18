import java.util.*;
class CipherText
{
    static String ct,key,ot="";
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter CipherText:");
        ct=sc.nextLine();
        ct=ct.toUpperCase();
        int l1=ct.length();
        System.out.println("Enter key:");
        key=sc.nextLine();
        key=key.toUpperCase();
        int l2=key.length();
        for(int i=0;i<l1;){
            for(int j=0;j<l2;j++){
                if(ct.charAt(i)>=65&&ct.charAt(i)<=100)
                    ot=ot+charNumBank(numCharBank(ct.charAt(i))+numCharBank(key.charAt(j)));
                else{
                    j--;
                    ot=ot+ct.charAt(i);
                }
                i++;
                if(i<l1)
                    continue;
                else
                    break;
            }
        }
        System.out.println("original text : "+ot);
    }

    static int numCharBank(char ch){
        int n=(int)ch-64;
        return n;
    }

    static char charNumBank(int m){
        if(m>26)
            m=m-26;
        char c=(char)(m+64);
        return c;
    }
}