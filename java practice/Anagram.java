
import java.util.*;
public class Anagram {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string :");
        String a=sc.next();
        System.out.println("Enter the second string :");
        String b=sc.next();
        char[] m=a.toLowerCase().toCharArray();
        char[] n= b.toLowerCase().toCharArray();

        Arrays.sort(m);
        Arrays.sort(n);

        if(Arrays.equals(m, n))
        {
            System.out.println("The strings are anagrams ");

        }
        else{
            System.out.println("The strings are not anagrams");
        }
    }
}

