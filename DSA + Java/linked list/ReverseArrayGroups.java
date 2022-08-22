public class ReverseArrayGroups{
    public static void main(String[] args) {
        int[] a ={1,2,4};
        int n=0;
        int[] b=new int[a.length];
        for(int i=a.length-1;i>=0;i--){
            b[n]=a[i];
            n++;
        }
        for(int i=0;i<a.length;i++){
            System.out.println(b[i]);
        }
       
    }
}

