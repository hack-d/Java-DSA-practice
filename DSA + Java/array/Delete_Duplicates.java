public class Delete_Duplicates {
    public static void main(String[] args) {
        int[] arr={1,3,4,5,5,6,7};
        int  i=0;
        int j=0;
        int[] arr2=new int[arr.length];
        while(i<arr.length-1){
            if(arr[i]==arr[i+1]){
                arr2[j]=arr[i];
                i=i+2;
                j++;
            }
            else{
                arr2[i]=arr[i];
                i++;
                j++;
            }
        }
        for(int k=0;k<arr2.length;k++){
            System.out.print(arr2[i]+" ");
        }
    }
}
