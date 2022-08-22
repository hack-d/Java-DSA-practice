import java.util.*;
public class LinkedListP {

    // node head;
    // public class node{
    //     int data;
    //     node next;

    //     node(int data){
    //         this.data=data;
    //         this.next=null;
    //     }
    // }
    // public void add(int data)
    // {
    //     node newNode=new node(data);
    //     if(head==null)
    //     {
    //         head=newNode;
    //         return;
    //     }

    //     node currNode=head;
    //     while(currNode.next!=null){
    //         currNode=currNode.next;

    //     }
    //     currNode.next=newNode;

    // }

    // //search
    // public void search(int value){
    //     node currNode=head;
    //     int i=1;
    //     while(currNode!=null)
    //     {

    //         if(currNode.data==value)
    //         {
    //             System.out.println("\nvalue found at index "+i);
    //             return;
    //         }
    //         currNode=currNode.next;
    //         i++;
    //     }
    //     System.out.println("\nValue not found");
    // }

    // public void printList(){
    //     node currNode=head;
    //     while(currNode!=null){
    //         System.out.print(currNode.data+" ");
    //         currNode=currNode.next;
    //     }
    // }

    // public static void main(String[] args) {
    //     LinkedListP list=new LinkedListP();
    //     list.add(1);
    //     list.add(5);
    //     list.add(7);
    //     list.add(3);
    //     list.add(8);
    //     list.add(2);
    //     list.printList();
    //     list.search(1);
        
    // }

    //using collection framework
    public static void main(String[] args){
        LinkedList<Integer> list=new LinkedList<Integer>();
        int value=1;
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(2);

        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)==value){
                System.out.println("Element found at index "+i);
                
            }
        }
    }
    
}
