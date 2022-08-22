
import java.util.Scanner;
import java.util.Random;

public class rock_paper_scissor {
    public static void main(String[] args){
        Random random=new Random();
        int computerInput=random.nextInt(3);

        for(int i=1;i<=3;i++)
        {
        System.out.println("\nWelcome to Rock Paper and Scissor\nGame:"+i);
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter\n'0' for Rock \n'1' for paper \n'2' for scissor.");
        int userInput=sc.nextInt();
        

        

        if(userInput==computerInput)
        {
            System.out.println("Draw!");
        }
        else if(userInput==1 && computerInput==0 || userInput==0 && computerInput==2 || userInput==2 && computerInput==1 )
        {
            System.out.println("You Win");
        }
        else 
        {
            System.out.println("Computer Wins");
        }

        if(computerInput==0)
        {
            System.out.println("Computer Choice: Rock");
        }
        else if(computerInput==1)
        {
            System.out.println("Computer Choice: Paper");  
        }
        else
        {
            System.out.println("Computer Choice: Scissors");
        }
    }
    
    }
    
}
