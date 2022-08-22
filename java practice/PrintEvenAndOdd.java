public class PrintEvenAndOdd {
    public static void main(String[] args)
    {
        int a[]={1,2,3,4,5,6};
        System.out.println("The even numbers are:");
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                System.out.print(a[i]+" ");
            }
        }
        
        System.out.println("\nThe odd numbers are:");
        for(int j=0;j<a.length;j++)
        {
            if(a[j]%2!=0)
            {
                System.out.print(a[j]+" ");
            }
        }
    }
}
