import java.util.*;
public class NumberAreEqual {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        //Taking inputs
        System.out.println("Enter 1st number");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number");
        int b=sc.nextInt();
        System.out.println("Enter 3rd number");
        int c=sc.nextInt();
        System.out.println("Enter 4th number");
        int d=sc.nextInt();

        //checking equal or not
        if(a==b && b==c && c==d)
        {
            System.out.println("The entered numbers are equals");
        }
        else{
            System.out.println("The numbers are not equal");
        }
        sc.close();
    }
    
}
