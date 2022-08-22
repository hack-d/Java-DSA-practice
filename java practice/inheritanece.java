import java.util.Scanner;
    class base{
     int x;

    public void setx(int x){
    System.out.println("I am in base class and setting x now");
    this.x=x;
    }

    public int getx(){
        return x;
    }
}
//This is inhertinace 
class derived extends base{
    int y;
    public void sety(int y){
        System.out.println("I am in derived class and setting y now");
        this.y=y;
    }
    public int gety(){
        return y;
    }
}

// class animal{
//    public String sound;
//    public String movement;

//    public String setSound()
//    {
//        Scanner in=new Scanner(System.in);
//        System.out.println("enter animal sound");
//        String k=in.next();
//         this.sound=k;
//         in.close();
//         return sound;
//    }

//    public String setMovement(String y)
//    {
//        this.movement=y;
//        return movement;
//    }

// }

// class dog extends animal
// {

// }

public class inheritanece {
    public static void main(String[] args) {
        derived b=new derived();
        b.sety(40);
        System.out.println(b.gety());
        b.setx(30);
        System.out.println(b.getx());

        // dog Dog=new dog();
        // System.out.println(Dog.setSound());
        // System.out.println(Dog.setMovement("running"));
        
        
    }
    
}
