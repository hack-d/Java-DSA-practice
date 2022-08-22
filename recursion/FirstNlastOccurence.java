//Time comlexity = O(n)
public class FirstNlastOccurence {
    //declaring variables globally inorder to avoid comsumption of memory at each function call
    public static int first=-1;//taking -1 bcuz if we didn't get the element it will return invalid index i.e -1
    public static int last=-1;
    public static int index=0;

    public static void search(String str,char element)
    {
        if(index==str.length())
        {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        
        if(str.charAt(index)==element)
        {
            if(first==-1)
            {
                first=index;
            }
            else{
                last=index;
            }
        }
        index++;
        search(str, element);
    }
    public static void main(String[] args) {
        String str="ababababaaa";
        search(str, 'a');
    }
    
}
