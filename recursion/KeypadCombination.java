//memorize it**
//Time complexity = 4^n
public class KeypadCombination {
    public static String[] map={".","abc","def","ghi","jkl","mno","pqrs","tu","vwz","yz"};
    public static void printComb(String str,int idx,String combination)
    {
        if(idx==str.length())
        {
            System.out.println(combination);
            return;
        }
        char currChar=str.charAt(idx);
        String mapping=map[currChar-'0'];

        for(int i=0;i<mapping.length();i++)
        {
            printComb(str, idx+1, combination+mapping.charAt(i));
        }

    }
    public static void main(String[] args) {
        String s="23";
        printComb(s, 0, "");
    }
}
