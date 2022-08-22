import java.util.*;
public class SearchingElementsInArray {
    public static void main(String[] args)
    {
        int a[]={9,7,6,8,9,3,2};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the element you want to search");
        int val=sc.nextInt();
        boolean flag=false;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==val)
            {
                System.out.println("Element found : "+a[i]+" in index "+i);
                flag=true;
            }
        }
        if(flag==false)
        {
            System.out.println("Element not found");
        }

    }
}
