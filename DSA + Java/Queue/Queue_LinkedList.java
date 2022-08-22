public class Queue_LinkedList {
    static class node{
        int data;
        node next;

        node(int data)
        {
            this.data=data;
            next=null;
        }
    }
    static class queue{
        static node head=null;
        static node rear=null;

        //isEmpty
        public static boolean isEmpty(){
            return head==null && rear==null;
        }

       
        //enqueue-O(1)
        public static void add(int data)
        {
           node newNode=new node(data);
            //if its first element
            if(head==null )
            {
                rear=head=newNode;
                return;
            }

            rear.next=newNode;
            rear=rear.next;
           
        }

        //dequeue-O(1)
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("Queue is empty");
                return -1;
            }
            //storing element for returning
            int result=head.data;
            head=head.next;

            //if there is only one element in queue
            if(rear==head)
            {
                rear=null;
            }
            
             
            return result;


        }

        //peek-O(1)
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Queue is empty");
                return -1;
            }
            
            return head.data;

        }
    }
    public static void main(String[] args) {
        queue q=new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);


        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
