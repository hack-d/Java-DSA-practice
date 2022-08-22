import java.util.Arrays;
public class ArraysAreEqual {
    public static void main(String[] args)
    {
        int a1[]={1,2,3,4,5};
        int a2[]={1,2,3,4,5,6};
       /* if(Arrays.equals(a1, a2))
        {
            System.out.println("Arrays are equal");
        }
        else{
            System.out.println("Arrays are not equal");
        }
        */

        boolean status=true;
        if(a1.length==a2.length)
        {
            for(int i=0;i<a1.length;i++)
            {
                if(a1[i]!=a2[i])
                {
                    status=false;
                }
            }
        
        if(status)
        {
            System.out.println("Both arrays are equal");
        }
        else{
            System.out.println("Both arrays are not equal");
        }
    }
    else{
        System.out.println("arrays are not equal");
    }
}
}
