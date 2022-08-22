public class swap_number
{
    public static void main(String[] args)
    {
      swap1(4,5);
    }

   
    static void swap1(int a,int b)
    {
        System.out.println("Before swapping \na = "+a+"\nb = "+b);

        //logic 1:
        //int temp=a;
        //a=b;
        //b=temp;

        //logic 2:
        //a=a+b;
        //b=a-b;
        //a=a-b;

        //logic 3 : using single statement
        b=a+b-(a=b);

        System.out.println("After swapping \na = "+a+"\nb = "+b);
    }
}
