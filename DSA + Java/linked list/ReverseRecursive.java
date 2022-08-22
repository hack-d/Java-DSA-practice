public class ReverseRecursive {
    node head;

    public class node{
        String data;
        node next;

        node(String data)
        {
            this.data=data;
            this.next=null;
        }
    }

    public void add(String data)
    {
        node newNode=new node(data);
        if(head==null){
            head=newNode;
            return;
        }

        if(head.next==null)
        {
            head.next=newNode;
            return;
        }

        node currNode=head;
        while(currNode.next!=null)
        {
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }

    //reverse list recursive
    public node reverse(node head){
        if(head==null || head.next==null)
        {
            return head;
        }
        node newHead=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }
   

    public void printList(){
        
        node currNode=head;
        
        while(currNode!=null)
        {
            System.out.print(currNode.data+" ");
            currNode=currNode.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ReverseRecursive list=new ReverseRecursive();
        list.add("This");
        list.add("is");
        list.add("a");
        list.add("linked");
        list.add("list");
        list.printList();
        list.head=list.reverse(list.head);
        list.printList();
        
       
    }
}
