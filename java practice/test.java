

public class test{
    public static void main(String[] args)
    {
       String s="My name is Roshan";
       s.strip();
       String arr[]=s.split(" ");
       for(int i=arr.length-1;i>=0;i--)
       {
            System.out.print(arr[i]+" ");

       }
}
}