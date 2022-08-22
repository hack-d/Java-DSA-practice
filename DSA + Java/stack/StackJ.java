public class StackJ {
    static class node{
        int data;
        node next;

        node(int data)
        {
            this.data=data;
            next=null;
        }
    }

    public static class stack{
        public static node head;
        
        //isEmpty
        public static boolean isEmpty(){
            return head==null;
        }

        //push
        public static void push(int data){
            node newNode=new node(data);
            if(isEmpty())
            {
                head=newNode;
                return;
            }

            
            newNode.next=head;
            head=newNode;
        }

        //pop
        public static int pop() {
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }

        //peek
        public static int peek() {
            if(isEmpty())
            {
                return -1;
            }

            return head.data;
        }
    }
    public static void main(String[] args) {
        stack s=new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
