//Time complexity = O(n!)
public class permutaioin {
    public static void permu(String str, String permutaion)
    {
        if(str.length()==0)
        {
            System.out.println(permutaion);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            char currChar=str.charAt(i);
            String newstr=str.substring(0, i)+str.substring(i+1);
            permu(newstr,permutaion+currChar);
        }
    }
    public static void main(String[] args) {
        String s="abc";
        permu(s, "");
    }
}
