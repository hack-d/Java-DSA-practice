public class ChangeRowsAndColumnsOfArray {
    public static void main(String[] args)
    {
        int arr[][]={{10,20,30},{40,50,60}};
       int arr2[][]=new int [arr[0].length][arr.length];
       for(int i=0;i<arr.length;i++)
       {
           for(int j=0;j<arr2.length;j++)
           {
               arr2[j][i]=arr[i][j];
           }
       }
       printArray(arr);
    }

    //printing array
    public static void printArray(int a[][])
    {
        int col_length=a[0].length;
        for(int i=0;i<col_length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                System.out.print(a[j][i]+" ");
            }
            System.out.println("");
        }
        
    }
}
