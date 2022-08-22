public class countSumOfDigits {
    public static void main(String[] args)
    {
        int num=12234;
        int sum=0;
        int count=0;
        while(num!=0)
        {
            sum=sum+num%10;
            num=num/10;
        }
        while(sum!=0)
        {
            sum=sum/10;
            count++;
        }
        System.out.println("The number of digits in the sum is : "+count);
    }
}
