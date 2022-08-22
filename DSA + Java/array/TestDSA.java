public class TestDSA {
    node head;//head of linked list making it global
    private int size;

    TestDSA()
    {
        this.size=0;
    }

    //creating a node
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

    //add first
    public void addFirst(String data)
    {
        node newNode=new node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    //add last
    public void addLast(String data)
    {
        node newNode=new node(data);

        //empty check
        if(head==null)
        {
            head=newNode;
            return;
        }
        
        node currNode=head;//last node tracker
        while(currNode.next!=null)
        {
            currNode=currNode.next;
        }

        currNode.next=newNode;//added
    }

    //delete first
    public void deleteFirst(){

        //if there is only one node
        if(head.next==null){
            head=null;
            size--;
            return; 
        }
        size--;
        head=head.next;
        
    }

    //delete last
    public void deleteLast(){
        size--;
        //if there is only one node
        if(head.next==null){
            head=null;
            size--;
            return; 
        }
        node currNode=head;//tracking second last node
        node lastNode=head.next;
    
        while(lastNode.next!=null)
        {
            currNode=currNode.next;
            lastNode=lastNode.next;
        }

        currNode.next=null;
        
    }

    //Print list
    public void printList(){
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data +"->");
            currNode=currNode.next;
        }
        System.out.println("null");
    }

    //get size;
   public int getSize(){
    return size;
   }


    public static void main(String[] args) {
        TestDSA list=new TestDSA();
        list.addFirst("is");
        list.addFirst("This");
        list.addLast("a");
        list.addLast("List");
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());
    }
}
