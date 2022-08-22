public class PlaceTiles {
    public static int place(int n,int m)
    {
        if(n==m)
        {
            return 2;
        }
        if(n<m)
        {
            return 1;
        }
        //horizontally
        int horizontally=place(n-m, m);

        //vertically
        int vertical=place(n-1, m);

        return horizontally+vertical;
    }
    public static void main(String[] args) {
        int n=4,m=2;
        System.out.println(place(n, m));
    }
}
