import java.util.Scanner;
public class Circumference_Of_Circle {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        float r=sc.nextFloat();
        sc.close();
        System.out.println("The circumference of the circle is : "+circum(r));
    }

    static double circum(float radius)
    {
        double c=2*3.14*radius;
        return c;
    }
}
