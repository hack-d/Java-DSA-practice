public class FindDuplicateElements {
    public static void main(String[] args)
    {
        String arr[]={"java","c","python","c","c++"};
        boolean flag=false;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println("Duplicate found : "+arr[j]+" ");
                    flag=true;
                }
            }
        }
        if(flag==false)
        {
            System.out.println("There are no duplicates");
        }
    }
}
