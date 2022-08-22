//Time complexity = O(2^n)
public class StringSubsequences {
        public static void subsequences(String str,int idx,String newStr)
        {
        if(idx==str.length())
        {
            System.out.println(newStr);
            return;
        }
        char currChar=str.charAt(idx);
        //to be
        subsequences(str,idx+1,newStr+currChar);
        //not to be
        subsequences(str,idx+1,newStr);
    }
    public static void main(String[] args) {
        String s="abc";
        subsequences(s,0,"");
    }
}
