public class LeftRotation {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int temp=0;
        int n=arr.length-1;

        for(int i=0;i<2;i++){
            temp=arr[0];
            for(int j=0;j<n;j++){
                arr[j]=arr[j+1];
            }
            arr[n]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        //doesnt work on hackerrank
        
    }
}
