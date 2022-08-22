public class SumOfArray {
    public static void main(String[] args)
    {
        int num[]={1,2,3,4,5};
        int sum=0;
        /*int len=num.length;
        for(int i=0;i<=len-1;i++)
        {
            sum=sum+num[i];
        }
        System.out.println("sum of the array is "+sum);
        System.out.println(len);
        */

        //using for each loop
        for(int value:num)
        {
            sum=sum+value;
        }
        System.out.println("sum of the array is "+sum);
    }
}
