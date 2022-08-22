public class Grid {
    public static void main(String[] args)
    {
        char arr[]={'-','-','-','-','-','-','-','-','-','-',};
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(arr[j]);
            }
            System.out.println();
        }
    }
}
