public class FactorialOfNumber {
    public static void main(String[] args)
    {
        int num=6;
        long factorial=1;
        /*for(int i=1;i<=num;i++)
        {
            factorial=factorial*i;
        }
        System.out.println("factorial of "+num+" is "+factorial);
        */
        int i=1;
        while(i<=num)
        {
            factorial=factorial*i;
            i++;
        }
        System.out.println("factorial of "+num+" is "+factorial);

    }
}
