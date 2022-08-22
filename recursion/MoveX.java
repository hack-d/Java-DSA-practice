//Time complexity O(n+n) => O(2n) = O(n)
//first n for traversing the string n times and 2nd n for looping n times
public class MoveX {
    static int count=0;
    static String newStr="";
    static int idx=0;
    public static void moveAllx(String str)
    {
        if(idx==str.length())
        {
            for(int i=0;i<count;i++)
            {
                newStr+='x';
            }
            System.out.println(newStr);
            return;
        }
        if(str.charAt(idx)=='x')
        {
            count++;
            idx++;
            moveAllx(str);
        }
        else{
            newStr+=str.charAt(idx);
            idx++;
            moveAllx(str);
            
        }
    }
    public static void main(String[] args) {
        String s="axxbxcde";
        moveAllx(s);
    }
    
}
