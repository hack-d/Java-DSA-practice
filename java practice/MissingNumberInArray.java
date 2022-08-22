public class MissingNumberInArray {
    public static void main(String[] args)
    {
        int a[]={1,2,3,4,5,7,8,9};
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }

        int sum1=0;
        for(int j=1;j<=9;j++)
        {
            sum1=sum1+j;
        }

        System.out.println("Missing number is : "+(sum1-sum));
    }
}
