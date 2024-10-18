import java.util.Scanner;
class EHLCouriers{
    private int wt;
public EHLCouriers()
    {
        wt=0;
    }
public void acceptWeight()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the weight of parcel");
        wt=sc.nextInt();
    }
    public void display()
    {
        int lwt;
        double f=0.0,rpw=0.0,pc=0.0;
        if(wt<=50)
        pc=20;
        else {
        lwt=wt-50;
        rpw=lwt/30;
        f=15*rpw;
        pc=20+f;
    }
    System.out.println("weight of parcel = "+wt+" gm");
    System.out.println("postal charge = Rs."+pc);
}
public static void main(String[]args){
        EHLCouriers e=new EHLCouriers();
        e.acceptWeight();
        e.display();
    }
}

        