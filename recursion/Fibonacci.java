public class Fibonacci {
    public static void printFibo(int a,int b,int n)
    {
        if(n==0)
        {
            return;
        }
        int c=a+b;
        System.out.print(" "+c);
        printFibo(b, c, n-1);
    }
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n=7;
        System.out.print(a+" "+b);
        printFibo(a,b,n-2);
    }
    
}
