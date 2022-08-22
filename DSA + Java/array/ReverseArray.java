public class ReverseArray{
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int i=0;
        int temp=0;
        int n=arr.length-1;

        while(n>i){
            temp=arr[i];
            arr[i]=arr[n];
            arr[n]=temp;
            i++;
            n--;
        }
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
}