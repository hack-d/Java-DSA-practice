import java.util.Scanner;

public class No_Of_vowels {
    static int count(String str)
    {
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o'
            || str.charAt(i)=='u')
            {
                count++;
            }
            
        }
        return count;

    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string : ");
        String input=sc.nextLine();
        sc.close();
        System.out.println("There are "+count(input)+" vowels in this string.");
    }
}
