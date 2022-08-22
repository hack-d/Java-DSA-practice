import java.util.*;
public class LinkedL{
    public static void main(String args[]) {
        //Syntax to create a linkedList
        LinkedList<String> list=new LinkedList<String>();

        //add methods
        list.add("This");
        list.addLast("is");
        list.addFirst("This");
        list.addLast("list");
        System.out.println(list);

        //remove methods
        list.remove(0);
        System.out.println(list);

        list.add(2,"a");//adding in between
        System.out.println(list);

        System.out.println(list.size());//printing the size of the list

        //iterating in a linkedList
        for(int i=0;i<list.size();i++)
        {
            //get method returns the  element in the given index
            System.out.print(list.get(i)+" -> ");
        }
    }
}