//checking if all the numbers are equal

import java.util.Scanner;
public class BasicPrograms1{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a=sc.nextInt();
        System.out.println("Enter second number : ");
        int b=sc.nextInt();
        System.out.println("Enter third number : ");
        int c=sc.nextInt();
        System.out.println("Enter fourth number : ");
        int d=sc.nextInt();

        if(a==b && b==c && c==d)
        {
            System.out.println("All the numbers are equal.");
        }
        else{
            System.out.println("The numbers are not equal.");
        }
        sc.close();
    }
}