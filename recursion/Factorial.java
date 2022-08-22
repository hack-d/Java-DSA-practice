public class Factorial {
    public static int calcFactorial(int n)
    {
        if(n==1 || n==0)
        {
            return 1;
        }

        int factn_1=calcFactorial(n-1);
        int fact=n*factn_1;
        return fact;
    }
    public static void main(String[] args)
    {
        System.out.println("The factorial is : "+calcFactorial(5));
    }
    
}
