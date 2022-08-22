public class Function_Average{
    public static void main(String[] args)
    {
        System.out.println(average(4,5,6));
    }
    static float  average(int a ,int b,int c)
    {
        int x=a;
        int y=b;
        int z=c;

        float avg=(x+y+z)/3;
        return avg;
    }
}