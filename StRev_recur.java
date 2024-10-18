class StRev_recur 
{ 
    //recursive method to reverse a given string
    void reverseString(String str) 
    { 
        //base condition; return if string is null or with 1 or less character 
        if ((str==null)||(str.length() <= 1)) 
           System.out.println(str); 
        else
        { 
            //recursively print each character in the string from the end 
            System.out.print(str.charAt(str.length()-1)); 
            reverseString(str.substring(0,str.length()-1)); 
        } 
    }
}

