class Employee{
    int salary;
    String name;
     public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
         name=n;
    }
}

class cellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate()
    {
        System.out.println("vibrating...");
    }
}  

class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return side*4;
    }
}

class tommy{
    public void fire()
    {
        System.out.println("Firing at the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void hit(){
        System.out.println("Hitting the enemy");
    }
}

public class oops {
    public static void main(String[] args)
    {
        //problem 1
        Employee roshan=new Employee();
        roshan.salary=50000;
        roshan.name="Roshan";
        System.out.println(roshan.getName());
        System.out.println(roshan.getSalary());
        
        //problem 2
        cellPhone RealMe=new cellPhone();
        RealMe.ring();
        RealMe.vibrate();

        //problem 3
        square sq=new square();
        sq.side=3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

        //problem 4
        tommy vice=new tommy();
        vice.run();
        vice.hit();
        vice.run();  
    }  
}
