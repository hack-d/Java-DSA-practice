import java.util.Scanner;

public class BasicPrograms3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        boolean flag=false;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' )
            {
                flag=true;
            }
        }
        if(flag==true)
        {
            System.out.println("The string contains vowel characters");
        }
        else 
        {
            System.out.println("The string doesn't contains vowel charater");
        }
        sc.close();
    }
}