import java.util.Scanner;

public class fibonacciNumbers {
     static int n1=0,n2=1;
    static int sum=0;
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        System.out.print(n1+" "+n2);
        for(int i=0;i<n-2;i++){
            sum=n1+n2;
            n1=n2;
            n2=sum;
            System.out.print(" "+sum);
        }
        //using recursion
        
    }
       /* void fibo(int i){
            if(i>=1)
            {
                sum=n1+n2;
                System.out.print(" "+sum);
                n1=n2;
                n2=sum;
                fibo(i-1);
            }
        }*/
}
