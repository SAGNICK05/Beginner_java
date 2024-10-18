void main()
{
	float prc, inst;
	printf("enter the principal amount");
	scanf("%f",&prc);
	inst=0.05*prc;
	printf("the interest for first year is=%f\n",inst,"\n");
	inst=0.05*(prc+inst);
	printf("the interest for second year is=%f\n",inst,"\n");
	inst=0.05*prc*(1+0.05*(1+0.05));
	printf("the interest for third year is=%f\n",inst,"\n");
}
