import java.util.*;
public class DecimalBinary {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a decimal number");
        int n=sc.nextInt();
        sc.close();
        int a[]=new int[100];
        int i=0;
       while(n!=0)
       {
           a[i]=n%2;
           n=n/2;
           i++;
       }
       System.out.println("The binary number is:");
       for( i=i-1;i>=0;i--)
       {
            System.out.print(a[i]);
       }
       System.out.print("\n");
       
    }
    
}
