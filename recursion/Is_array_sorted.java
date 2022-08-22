//Time complexity = O(n) where n is the length of array
public class Is_array_sorted {
    public static boolean isSorted(int arr[], int index)
    {
        if(index==arr.length-1)
        {
            return true;
        }
        if(arr[index]>=arr[index+1])
        {
            return false;
        }
        else{
            return isSorted(arr,index+1);
        }
    }
public static void main(String[] args) {
    int n=0;
    int a[]={1,2,3,4,9,8};
    System.out.println(isSorted(a, n));
}
}
