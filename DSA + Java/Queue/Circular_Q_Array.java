

public class Circular_Q_Array {
    static class queue{
        static int size;
        static int arr[];
        static int rear=-1;
        static int front=-1;
        
        queue(int n){
            size=n;
            arr=new  int[n];
        }

        //isEmpty
        public static boolean isEmpty(){
            return front==-1 && rear==-1;
        }

        //isFull
        public static boolean isFull()
        {
            return (rear+1)%size==front;
        }

        //enqueue-O(1)
        public static void add(int data)
        {
            if(isFull())
            {
                System.out.println("Queue is full");
                return;
            }

            //if its first element
            if(front==-1)
            {
                front=0;
            }

            rear=(rear+1)%size;
            arr[rear]=data;
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
            int result=arr[front];

            //if there is only one element in queue
            if(rear==front)
            {
                rear=front=-1;
            }
            else
            front=(front+1)%size;
             
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
            
            return arr[front];

        }
    }
    public static void main(String[] args) {
        queue q=new queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);

        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
