public class CalcPower {
    public static int power(int x,int n)
    {
        if(n==0)
        {
            return 1;//because anything to the power 0 is 1
        }
        if(x==0)
        {
            return 0;
        }
        int powxnm1=power(x, n-1);//calculating x^n-1 and storing it
        int powx=x*powxnm1;//using formula xpow=x*(x^n-1)
        return powx;
    }
    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }
    
}
