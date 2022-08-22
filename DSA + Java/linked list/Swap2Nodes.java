public class Swap2Nodes {
    node head;
    int size;

    Swap2Nodes(){
        this.size=0;
    }

    public class node{
        String data;
        node next;

        node(String data)
        {
            this.data=data;
            this.next=null;
            size++;
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
    public void swap(){
        
        if(head==null || head.next==null)
        {
            return;
        }
        
        node prevNode=head;
        head=prevNode.next;
        
        
        while(true)
        {
            node currNode=prevNode.next;
            node temp=currNode.next;
            currNode.next=prevNode;

            if(temp==null || temp.next==null)
            {
                prevNode.next=null;
                break;
            }
            prevNode.next=temp.next;
            prevNode=temp;
        }
        
        
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
        Swap2Nodes list=new Swap2Nodes();
        list.add("this");
        list.add("is");
        list.add("a");
        list.add("list");
        list.printList();
        list.swap();
        list.printList();


    }
}
