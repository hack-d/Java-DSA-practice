import java.util.Scanner;

public class Square_Pattern{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows : ");
        int m=sc.nextInt();
        System.out.print("Enter columns : ");
        int n=sc.nextInt();
        for(int i=0;i<m;i++)
        {
           for(int j=0;j<=n;j++)
           {
                if(i==0 || i==m || j==0 || j==n)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
           }
           System.out.println();

        }
        sc.close();
    }
}