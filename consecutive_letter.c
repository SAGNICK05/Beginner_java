void main()
{
	char word[100],nword[100],ch;
	printf("enter the word\n");
	gets(word);
	strupr(word);
	int i,j,k,count=0;
	while(word[i]!='\0')
	{
		ch=word[i];
		if(ch!=" "||ch!='\0')
		{
		   nword[j]=word[i];
		   j++;
	    }
		else
		{
		   for(k=0;k<strlen(nword)-1;k++)
		   {
		    if(((int)nword[k])+1==(int)nword[k+1])
		       count++;
		   }
		  printf("%s",nword); 
		  j=0;
	    }
	    i++;
	}
	printf("the no of repitition is %d",count); 
}
