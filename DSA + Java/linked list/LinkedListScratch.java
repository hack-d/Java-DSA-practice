public class LinkedListScratch {
    node head;
    private int size;
    LinkedListScratch(){
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

    public void addFirst(String data){
        node newNode=new node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }

        newNode.next=head;
        head=newNode;
        }
    
    public void addLast(String data){
        node newNode=new node(data);
        if(head==null){
            head=newNode;
            return;
        }

        node currNode=head;
        while(currNode.next!=null)
        {
            currNode=currNode.next;
        }
        currNode.next=newNode;


    }
    //add in middle
    public void addInMiddle(String data,int index)
    {
        node newNode=new node(data);
        if(head==null || index==1)
        {
            newNode.next=head;
            head=newNode;

            return;
        }
        if(index>size || index<0)
        {
            System.out.println("Invalid index");
            return;
        }

        node currNode=head;
        node nextNode;
        for(int i=2;i<size;i++)
        {
            
            
            if(i==index)
            {
                nextNode=currNode.next;
                currNode.next=newNode;
                newNode.next=nextNode;
                break;
            }
            currNode=currNode.next;
        }

    }
    //delete first
    public void deleteFirst(){
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        if(head.next==null)
        {
            size--;
            head=null;
            return;
        }
        size--;
        head=head.next;

    }
    //delete last
    public void deleteLast()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        if(head.next==null)
        {
            size--;
            head=null;
            return;
        }
        
        node currNode=head;
        node lastNode=head.next;
        while(lastNode.next!=null)
        {
            lastNode=lastNode.next;
            currNode=currNode.next;
            
        }
        size--;
        currNode.next=null;
        
    }

    //printf
    public void printList()
    {
        node currNode=head;
        while(currNode!=null)
        {
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("null");
    }

    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
      LinkedListScratch list=new LinkedListScratch();
      list.addFirst("is");
      list.addFirst("This");
       list.printList();
       list.addLast("list");
       list.printList();
       list.deleteFirst();
       list.printList();
       list.deleteLast();
       list.printList();
       list.deleteLast();
       list.printList();
       list.addFirst("is");
       list.addLast("a");
       list.printList();
       list.addInMiddle("middle", 1);
       list.printList();
       list.addInMiddle("middle", 1);
       list.printList();


       System.out.println(list.getSize());
    }  
}
