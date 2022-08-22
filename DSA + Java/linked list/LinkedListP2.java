import java.util.*;
public class LinkedListP2 {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements in the list");
        int element;
        for(int i=0;i<6;i++)
        {
            element=sc.nextInt();
            list.add(i,element);
        }

        System.out.println(list);

        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)>25)
            {
                list.remove(i);
            }
        }
        System.out.println(list);
        sc.close();
    }
}
