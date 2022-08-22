public class findLargestNumber {
    public static void main(String[] args)
    {
        int num1=10;
        int num2=50;
        int num3=40;
        
       /* if(num1>num2 && num1>num3)
        {
            System.out.println("The largest number is "+num1);
        }
        else if(num2>num1 && num2>num3)
        {
            System.out.println("The largest number is "+num2);
        }
        else{
            System.out.println("The largest number is "+num3);
        }
        */

        //using ternary operator
        int largest1=num1>num2?num1:num2;
        int largest2=num3>largest1?num3:largest1;
        System.out.println(largest2+" is the greater number");
    }
}
