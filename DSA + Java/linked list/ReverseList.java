public class ReverseList {
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

    //reverse list
    public void reverse(){
        if(head==null || head.next==null){
            return;
        }
        node prevNode=head;
        node currNode=head.next;
        while(currNode!=null){
            //defining next node
            node nextNode=currNode.next;
            currNode.next=prevNode;

            //update
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
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
        ReverseList list=new ReverseList();
        list.add("This");
        list.add("is");
        list.add("a");
        list.add("linked");
        list.add("list");
        list.printList();
        list.reverse();
        list.printList();
    }
}
