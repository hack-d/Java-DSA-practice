/*** What is hashset? ***/
import java.util.HashSet;//using hashset must see on youtube about it

public class UniqueSubsequence {
    public static void subsequences(String str,int idx,String newStr,HashSet<String> set)
    {
    if(idx==str.length())
    {
        if(set.contains(newStr))
        {
            return;
        }
        else{
        System.out.println(newStr);
        set.add(newStr);
        return;
    }
}
    char currChar=str.charAt(idx);
    //to be
    subsequences(str,idx+1,newStr+currChar,set);
    //not to be
    subsequences(str,idx+1,newStr,set);
}
public static void main(String[] args) {
    String s="aaa";
    HashSet<String> set=new HashSet<>();
    subsequences(s,0,"",set);
}
}
