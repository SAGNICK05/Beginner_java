import java.util.Scanner;
class BlueHeavenTravels
{
 private String pasgName;int dist;char tMode;
void accept()
    {       
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the passenger name : ");
        pasgName=sc.nextLine();
        System.out.print("enter the distance travelled : ");
        dist=sc.nextInt();
        System.out.print("enter the mode of travel C for car and B for Bus : ");
        tMode=sc.next().charAt(0);
    }
double calculateFare()
    {
        double fare=0.0;
        switch(tMode)
        {
            case'C':
            if(dist<=20)
            fare=dist*40;
            else if(dist<=60)
            fare=dist*35;
            else 
            fare=dist*32;
            break;
            
            case'B':
            if(dist<=20)
            fare=dist*25;
            else if(dist<=60)
            fare=dist*20;
            else 
            fare=dist*15;
            break;
            
            default:
            System.out.println("wrong input");
        }
        return(fare);
    }
void display()
    {
        double fare=calculateFare();
        System.out.println("passengers name\t\tmode of journey\t\tdistance travelled\ttotal fare");
        System.out.println("  "+pasgName+"\t\t\t"+tMode+"\t\t\t"+dist+"\t\t"+"  "+fare);
    }
    public static void main(String[]args)
    {
        BlueHeavenTravels b=new BlueHeavenTravels();
        b.accept();
        b.display();
}
}