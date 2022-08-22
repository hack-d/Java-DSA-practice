public class Greatest_Of_Two {
    public static void main(String[] args)
    {
        System.out.println(greatest(101,100));
    }

    static int greatest(int n,int m)
    {
        if(n>m){
            return n;
        }
        else{
            return m;
        }
    }
}
