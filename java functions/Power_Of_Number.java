public class Power_Of_Number {
    public static void main(String[] args)
    {
        System.out.println("Answer : "+power(2, 3));
    }
    static int power(int a,int b)
    {
        int p=1;
        for(int i=1;i<=b;i++)
        {
            p=p*a;
        }
        return p;
    }
}
