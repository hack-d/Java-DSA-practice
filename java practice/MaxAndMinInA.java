public class MaxAndMinInA{
    public static void main(String[] args)
    {
        int a[]={30,50,10,20,90,110};
         int max=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("The greatest element is : "+max);
        int min=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
            System.out.println("The minminum element is : "+min);
        
    }
}