import java.util.Scanner;

public class Count_Of_Pos_Neg {
    public static void main(String[] args)
    {
        int pos=0,neg=0,zero=0;
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("press 1 to start 0 stop");
        int input=sc.nextInt();
        
            while(input==1)
            {
                System.out.print("Enter the number : ");
                number=sc.nextInt();
                if(number<0)
                {
                    neg++;
                }
                else if(number>=1)
                {
                    pos++;
                }
                else{
                    zero++;
                }
                System.out.println("Press 1 to contiue 0 to stop");
                input=sc.nextInt();
            }
            System.out.println("Positive :"+pos);
            System.out.println("neg :"+neg);
            System.out.println("zero :"+zero);
        sc.close();
    }
}
