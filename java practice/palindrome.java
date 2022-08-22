import java.util.*;
public class palindrome {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a palindrome number :");
        int num=sc.nextInt();
        int number=num;
        int rev=0;
        while(num!=0)
        {
            rev=rev*10+num%10;
            num=num/10;
        }
        if(number==rev)
        {
            System.out.println("the number "+number+" is a palindrome");
        }
        else{
            System.out.println("The number "+number+" is not a palindrome");
        }
    
}
}
