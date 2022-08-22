public class SumofNaturalnumbers {
    public static void Print(int i,int n,int sum)
    {
        if(i==n)
        {
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum=sum+i;
        Print(i+1,n,sum);
    }
    public static void main(String[] args)
    {
        Print(1, 5, 0);
    }
}
