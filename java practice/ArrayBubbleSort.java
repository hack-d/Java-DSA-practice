import java.util.Arrays;

public class ArrayBubbleSort {
    public static void main(String[] args)
    {
        int a[]={4,5,9,50,3,1,1,2};
        System.out.println("Array before sorting\n"+Arrays.toString(a));
        int n=a.length;
        int temp=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("Array after sorting\n"+Arrays.toString(a));
    }
    
}
