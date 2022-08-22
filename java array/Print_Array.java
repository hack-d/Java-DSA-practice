import java.util.Scanner;

public class Print_Array{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements : ");
        int arr[]=new int[10];
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Elements are:");
        for(int j=0;j<5;j++)
        {
            System.out.println(arr[j]);
        }
        sc.close();
    }
}