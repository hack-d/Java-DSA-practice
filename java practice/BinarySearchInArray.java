import java.util.*;
public class BinarySearchInArray {
    public static void main(String[] args)
    {
        int a[]={1, 2, 3, 4 ,5 };
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter element you want to search : ");
        int key=sc.nextInt();
        int l=0;
        int h=a.length-1;
        boolean flag=false;
        
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(key==a[mid])
            {
                System.out.println("Element found : "+a[mid]+" at index "+mid);
                flag=true;
                break;

            }
            if(key<a[mid]){
                h=mid-1;
            }
            if(key>a[mid])
            {
                l=mid+1;
            }
        }
        if(flag==false)
        {
            System.out.println("Element not found");
        }
    }
}
