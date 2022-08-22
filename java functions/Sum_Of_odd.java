public class Sum_Of_odd {
    static int sum=0;
    public static void main(String[] args)
    {
        System.out.println(sum(9));
    }

    public static int sum(int range)
    {
        
        int a=range;
        for(int i=1;i<=a;i++)
        {
            if(i%2!=0)
            {
                sum=sum+i;
            }
        }
        return sum;
    }
}
