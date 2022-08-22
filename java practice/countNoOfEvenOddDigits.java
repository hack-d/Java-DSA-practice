public class countNoOfEvenOddDigits {
    public static void main(String[] args)
    {
        int num=123456;
        int evenCount=0;
        int oddCount=0;
        int num1=0;
        while(num!=0)
        {
            num1=num%10;
            num=num/10;
            if(num1%2==0)
            {
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        System.out.println("The number of even digits are : "+evenCount+"\nThe number of odd digits are : "+oddCount);
    }
}
