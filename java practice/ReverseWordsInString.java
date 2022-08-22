import java.util.*;
public class ReverseWordsInString {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sentence :");
        String s=sc.nextLine();
        String words[]=s.split(" ");
        String reverse="";
        String Str="";
        for(String w:words)
        {
            for(int i=w.length()-1;i>=0;i--)
            {
                reverse=reverse+w.charAt(i);
            }
            Str=Str+reverse+" ";
            reverse="";
        }
        System.out.println("Reverds words in the sentence is : "+Str);
    }
    
}
