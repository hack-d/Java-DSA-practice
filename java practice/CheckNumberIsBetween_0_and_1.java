import java.util.*;

public class CheckNumberIsBetween_0_and_1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        //Taking input
        System.out.println("Enter 1st number");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number");
        int b=sc.nextInt();

        //checking
        if((a>=0 && a<=1) && (b>=0 && b<=1))
        {
            System.out.println("True");
        }
        
        else{
            System.out.println("False");
        }
    }
}
