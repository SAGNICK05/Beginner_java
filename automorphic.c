#include <math.h>
void main()
{
	int n,i,count,last,num,df10,n1;
	printf("enter the number\n");
	scanf("%d",&n);
	n1=n;
	while(n>0)
	{
		count++;
		n/=10;	
	}		
	num=pow(n1,2);
	df10=pow(10,count);
	last=num%df10;
	if(last==n1)
	printf("the nummber is automorphic number");
	else
	printf("the number is not an automorphic number");
}
