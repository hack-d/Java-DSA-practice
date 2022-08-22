//Time complexity = logn
//base case is used to terminate the loop in recursion
public class CalcPowerOptimized {
    public static int power(int x, int n)
    {
        //base case 1
        if(n==0)
            return 1;
        //base case 2
        if(x==0)
            return 0;

        //when power is even
        if(n%2==0)
        {
            return power(x, n/2)*power(x, n/2);//x^n = x^n/2 * x^n/2
        }
        //when power is odd
        else{
            return power(x, n/2)*power(x, n/2)*x;//x^n = x^n/2 * x^n/2 * x 
        }

    }
    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }
    
}
