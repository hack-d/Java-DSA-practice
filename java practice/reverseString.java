import java.util.*;
public class reverseString {
    public static void main(String[] args)
    {
        System.out.println("Enter a string : ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
       /* int length=str.length();
        String rev="";

        for(int i=length-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        System.out.println("The reversed string is : "+rev);*/
        

        //logic 2:using string r
        StringBuffer sb=new StringBuffer(str);
        System.out.println(sb.reverse());
    }
    
}
