import java.util.*;
public class generatePrime {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number ");
        int num=sc.nextInt();
        int count=0;
        int k=2;
        int count2=1;

        if(num>1)
        {
            while(count2<=num)
            {
                for(int j=1;j<=k;j++)
                {
                    if(k%j==0)
                    {
                        count++;
                    }
                }
                if(count==2)
                {   
                    count2++; 
                    System.out.print(k+" ");    
                }
                count=0;
                k++;
            }    
        }
}
}

