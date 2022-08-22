//Time complexity = O(n)
public class RemoveDuplicates {
    public static boolean[] map=new boolean[26];
    public static int idx=0;
    public static String newStr="";
    
    public static void remove(String str)
    {
        if(idx==str.length())
        {
            System.out.println(newStr);
            return;
        }
        char currChar=str.charAt(idx);
        if(map[currChar-'a']==true)
        {
            idx++;
            remove(str);
        }
        else{
            newStr+=currChar;
            map[currChar-'a']=true;
            idx++;
            remove(str);
        }
    }
    public static void main(String[] args) {
        String s="abbbcckkllghde";
        remove(s);
    }
}
