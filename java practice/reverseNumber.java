import java.util.*;
public class reverseNumber {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        
        //logic 1:By using while loop and mod
       /* int rev=0;
        while(num!=0)
        {
            rev=rev*10+num%10;
            num=num/10;
        }
        */

        //logic 2:By using stringnuffer class
        StringBuffer sb=new StringBuffer(String.valueOf(num));
        StringBuffer rev=sb.reverse();

        System.out.println("The reversed number is "+rev);
    }
}
