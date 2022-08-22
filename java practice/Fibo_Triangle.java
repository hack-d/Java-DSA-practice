import java.util.*;
public class Fibo_Triangle {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit : ");
        int n=sc.nextInt();
        int a,b;
        int sum=0;
        for(int i=0;i<n-1;i++)
        {
            a=0;
            b=1;
            System.out.print(b);
            for(int j=0;j<i;j++)
            {
                sum=a+b;
                a=b;
                b=sum;
                System.out.print(" "+sum);
            }
            System.out.print("\n");
        }
    }
}
