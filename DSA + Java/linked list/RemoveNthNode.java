//testcases not passed
public class RemoveNthNode {
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

    public void printList(){
        node currNode=head;
        while(currNode!=null)
        {
            System.out.print(currNode.data+" ");
            currNode=currNode.next;
        }
        System.out.println();
    }

    //remove nth node
    public String removeNth(int n){
        node prevNode=head;
        node currNode=head.next;
        for(int i=1;i<n;i++)
        {
           
            if(currNode.next==null || currNode==null)
            {
                break;
            }
            currNode=currNode.next;
            prevNode=prevNode.next;
           
            
        }
        String temp=currNode.data;
        prevNode.next=currNode.next;
        currNode.next=null;
        return temp;

    }
    public static void main(String[] args) {
      RemoveNthNode list=new RemoveNthNode();
      list.add("1");
      
      list.printList();
      System.out.println(list.removeNth(6));
      list.printList();
    }
}
