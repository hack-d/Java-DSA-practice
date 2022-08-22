public class PrintContentsOf_2D_array {
    public static void main(String[] args)
    {
        boolean arr[][]={{true,false,true},{false,true,true}};
        int row_length=arr.length;
        int column_length=arr[0].length;

        for(int i=0;i<row_length;i++)
        {
            for(int j=0;j<column_length;j++)
            {
                if(arr[i][j])
                {
                    System.out.print("t");
                }
                else{
                    System.out.print("f");
                }
            }
            System.out.println("");
        }
    }
}
