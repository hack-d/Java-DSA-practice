//testcases not passed
public class RevBetween {
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

    //reverse  between index
    public void reverseBtw(int n,int m)
    {
        
        node prehead=head;
        node prev=head.next;
        
        for(int i=1;i<n-1;i++)
        {
            prehead=prehead.next;
            prev=prev.next;
        }

        
        for(int i=n;i<m-1;i++)
        {
            node curr=prev.next;
            prev.next=curr.next;

            //update
            curr.next=prehead.next;
            prehead.next=curr;
            
        }
    

        
    }

    public static void main(String[] args) {
        RevBetween list=new RevBetween();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.printList();
        list.reverseBtw(2, 6);
        list.printList();
    }
}
