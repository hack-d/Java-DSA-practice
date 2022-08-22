import java.util.Scanner;
import java.util.*;

class Game{
    public int number;
    public int noOfGuesses=0;
    public int num;

    Game(){
        Random random=new Random();
        this.number=random.nextInt(100);
    }

    public void UserInput()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter the number");
        this.num=sc.nextInt();
        
    }

     boolean isCorrect(){

        if(num==number)
        {
            System.out.println("You have guessed it right\nYOU WIN");
            return true;
        }
        else if(num<number)
        {
            System.out.println("Too low");
        }
        else if(num>number)
        {
            System.out.println("Too high");
        }
        return false;
    }
    
}

public class Guess_The_Number{
    public static void main(String[] args){
        Game game=new Game();
        boolean b=false;
        while(!b)
        {
        game.UserInput();
        b=game.isCorrect();  
    }
}
}
