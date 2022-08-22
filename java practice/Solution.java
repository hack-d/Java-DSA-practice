import java.math.BigDecimal;
import java.util.*;
class Solution{

    public static void main(String []args){
        //Input
        System.out.println("Enter input");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();

        //Write your code here
        Comparator<String> myCusComparator=new Comparator<String>(){
        
            @Override
            public int compare(String o1, String o2) {
                // TODO Auto-generated method stub
                BigDecimal a=new BigDecimal(o1);
                BigDecimal b=new BigDecimal(o2);
                return b.compareTo(a);
            }
        };
        Arrays.sort(s , 0, n, myCusComparator);

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}

