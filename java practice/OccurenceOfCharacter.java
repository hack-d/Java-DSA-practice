import java.util.*;
public class OccurenceOfCharacter {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s="java programming language";
        System.out.println("Enter the charcter you want to see the occurence of in : "+s);
        char ok=sc.next().charAt(0);
        
       
        
        int l=s.length();
        int count=0;
        for(int i=0;i<l-1;i++)
        {
            if(s.charAt(i)==ok)
            {
                count ++;
            }
        }
        System.out.println("The occurence of character "+ok+" is "+count+" times.");
        sc.close();
    }
    
}
