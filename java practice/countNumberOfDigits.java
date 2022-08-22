import java.util.*;
public class countNumberOfDigits {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        int count=0;
        while(num>0)
        {
            num=num/10;
            count=count+1;
        }
        System.out.println("\nThe number of digits are : "+count);
    }
    
}
