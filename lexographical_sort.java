import java.io.*;
class lexographical_sort
{
    public static void main (String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
        int i,j,l,p,x,now;
        String str,word,temp;
        char ch;
        System.out.println("Enter a sentence ");
        str = br.readLine();
        l = str.length();
        now = 0; //To count the  number of words
        for(i=0;i< l;i++){
            ch = str.charAt(i);
            if(ch == ' ' || ch == '?' || ch == '.'
            || ch == '!')
                now++;
        }

        String words[] = new String[now];

        x=0; //Used as index pointer for string array
        p=0; //To store the index of first letter of each word

        for(i=0;i< l;i++){
            ch = str.charAt(i);
            if(ch == ' ' || ch == '?' || ch == '.' 
            || ch == '!'){
                word = str.substring(p,i);
                words[x++] = word;
                p = i+1;
            }
        }

        //Sort the words in string array in alphabetical order

        for(i=1; i< x; i++){
            for(j=0; j< x-i; j++){
                if(words[j].compareTo(words[j+1]) > 0){
                    temp = words[j];
                    words[j] = words[j+1];
                    words[j+1] = temp;
                }
            }
        }

        System.out.println("Length: "+now);
        System.out.println("Rearranged sentence: ");
        for(i=0; i< x; i++){
            System.out.print(words[i]+" ");
        }
    }//end of main
}//end of class    