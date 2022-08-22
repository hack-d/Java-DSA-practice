import java.util.*;

public class CountNoOfWords {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        String s=sc.nextLine();
        
        //using split function
        String str[]=s.split(" ");
        int words=str.length;
        System.out.println("no. of words : "+words);

        //using logic
        /*int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                count++;
            }
        }
        if(s.isEmpty())
        {
            System.out.println("u did not enter a sentence");
        }
        else{
            int words=count+1;
            System.out.println("The number of words in the sentence is "+words);

    }*/
}
}