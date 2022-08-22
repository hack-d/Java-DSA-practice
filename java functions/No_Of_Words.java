import java.util.Scanner;

public class No_Of_Words {
    static void countWords(String str)
    {
        if(str.charAt(0)==' ')
        {
            System.out.println("A sentence never starts with a space.");
        }
        else
        {
            String[] arr=str.split(" ");
            int length=arr.length;
            System.out.println("The number of words are : "+length);
        }
        
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string : ");
        String input=sc.nextLine();
        sc.close();
        countWords(input);
    }
}
