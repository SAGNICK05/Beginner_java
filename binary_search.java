import java.io.*;
public class binary_search {

	public static void main(String[] args)throws IOException {
		BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the no of elementsof the array");
		int n=Integer.parseInt(obj.readLine());
		int arr[]=new int[n];
		
		System.out.println("enter the elememts of the array");
		for(int i=0;i<n;i++)
			arr[i]=Integer.parseInt(obj.readLine());
		
		System.out.println("entr the searching elemrnt");
		int g=Integer.parseInt(obj.readLine());
		boolean f=false;

		int upper=n-1, lower=0, mid=0,k=0;
		while(upper>lower)
		{
			mid=(upper+lower)/2;
			if(arr[mid]==g)
			{
				f=true;
				k=mid;
				break;
			}
			else
			{
				if(arr[mid]>g)
					upper=mid+1;
				else
					lower=mid+1;
			}
		}
		if(f==true)
			System.out.println("element found at position"+k);
		else
			System.out.println("element not found");
	}
	}

