import java.util.Scanner;

public class Eligible_To_Vote {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age=sc.nextInt();
        is_Eligible(age);
        sc.close();
    }

    static void is_Eligible(int a){
        if(a>=18)
        {
            System.out.println("You are eligible to vote.");
        }
        else{
            System.out.println("Sorry! You are not eligible to vote.");
        }
    }
}
