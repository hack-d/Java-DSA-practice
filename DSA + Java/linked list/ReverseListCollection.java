import java.util.*;
public class ReverseListCollection {
    public static void main(String[] args) {
       LinkedList<String> list=new LinkedList<String>();
       list.add("This");
       list.add("is");
       list.add("Linked");
       list.add("list");
       List sub=list.subList(1, 3);
        Collections.reverse(sub); 
        System.out.println(sub);
        System.out.print(list);
    }
}
