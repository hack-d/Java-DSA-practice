import java.util.*;
public class GCD {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        int cf=0;
        for(int i=1;i<a;i++)
        {
            if(a%i==0 && b%i==0){
                cf=i;
            }
        }
        System.out.println(cf);
        sc.close();
    }
}
