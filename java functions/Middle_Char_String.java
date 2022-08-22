import java.util.Scanner;

public class Middle_Char_String {
        
        static void middle_char(String str)
        {
            int length=str.length();
            int middle=length/2;
            if(middle%2==0)
            {
                char a=str.charAt(middle);
                char b=str.charAt(middle-1);
                System.out.println(b+""+a);
            }
            else
            {
                char c=str.charAt(middle);
                System.out.println(c);
            }
            
        }
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter a string : ");
            String input=sc.next();
            sc.close();
            middle_char(input);
        }
    
}
