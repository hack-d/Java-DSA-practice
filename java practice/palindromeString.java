import java.util.*;
public class palindromeString {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a palindrome word : ");
        String str=sc.nextLine();
        String rev="";
        int length=str.length();
        String str2=str;
        for(int i=length-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
       
        if(str2.equals(rev))
        {
            System.out.println(str2+" is a palindrome");
        }
        else{
            System.out.println(str2+" is not a palindrome");
        }
    }
}
