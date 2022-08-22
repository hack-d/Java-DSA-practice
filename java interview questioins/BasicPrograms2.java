//reverse a string
import java.util.*;
public class BasicPrograms2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        String result="";
        if(s==""){
            System.out.println("The string is not entered");
        }
        else{
            for(int i=s.length()-1;i>=0;i--)
            {
                result=result+s.charAt(i);
            }
        }
        System.out.println(result);

        //Reverse words in string
        /*String[] arr=s.split(" ");
        for(int i=arr.length-1;i>=0;i--)
        {
           result=result+arr[i]+" "; 
        }
        System.out.println(result);
        sc.close();*/
    }
}
