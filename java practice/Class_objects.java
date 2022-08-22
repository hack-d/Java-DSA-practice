class Employee1{
    String name;
    int salary;

    public void printDetails(){
        System.out.println("my name is "+name);
        System.out.println("Salary is "+salary);
    }

    public void getSalary(int sal){
         salary=sal;
    }

    public String getName(){
        return name;
    }
}

class square1{
    static int side;
    public void getSide(int sd){
       square1.side=sd;
    }
    
    public int area1(){
        int area1=side*side;
        return area1;
    }
    public int perimeter1(){
        int perimeter1=4*side;
        return perimeter1;
    }
    public void printDetails()
    {
        System.out.println("Area = "+area1());
        System.out.println("perimeter = "+perimeter1());
    }
}
public class Class_objects {
    public static void main(String[] args){
    square1 s=new square1();
    s.getSide(5);
    s.area1();
    s.perimeter1();
    s.printDetails();
}
}
