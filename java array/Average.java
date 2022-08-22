public class Average {
    public static void main(String[] args)
    {
        int arr[]={3,4,5,7,9};
        float sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        float avg=sum/arr.length;
        System.out.println("Average : "+avg);
    }
}
