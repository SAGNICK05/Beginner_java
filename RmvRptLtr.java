/* 
 * PROGRAM TO ACCEPT ANY SENTENCE REMOVE ALL REPEATED LETTER 
SEQUENCES FROM WORDS IN THE SENTENCE 
 */ 
 
import java.util.*;  
class RmvRptLtr 
{ 
    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in); 
        System.out.print("\n Enter any sentence :");        
        String s=sc.nextLine();       
        s=s.trim()+" ";         
        int len=s.length(); 
        String str="",temp="";          
        for(int i=0;i<len;i++) 
        { 
            char ch=s.charAt(i); 
            if(ch!=' ')  // forms a word from the sentence             
              temp=temp+ch;           
            else 
                { 
                    temp+=" "; // concatenates a blankspace at the end of the word              
                    int len2=temp.length(); // stores the length of a extracted word 
                    for(int j=0;j<len2-1;j++) // runs till len2-1 as consecutive letters are extracted 
                    { 
                        char ch1=temp.charAt(j); // consecutive letters are extracted               
                        char ch2=temp.charAt(j+1); 
                        while(ch1==ch2) // if consecutuve letters are same, then runs inside the loop 
                            { 
                                j++; // skips similar letters in the consecutive positions in the word                 
                                ch1=temp.charAt(j);                        
                                ch2=temp.charAt(j+1); 
                             } 
                             str+=ch1; // concatenates the letter only once in the final sentence 
                    } 
                    str+=" "; // a blank space is concatenated to separate two words                 
                    temp=""; // reinitializes to accept the next word in next iteration 
                } 
        }        
            System.out.print("\n New Sentence :"+str); // displays the new sentence 
    } 
} 
