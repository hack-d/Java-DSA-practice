public class Q_UsingArray{
    static class queue{
        static int arr[];
        static int size;
        static int rear=-1;

        queue(int n)
        {
            this.size=n;
            arr=new int[n];
        }

        //isEmpty
        static boolean isEmpty(){
            return rear==-1;
        }

        //enqueue
        static void add(int data)
        {
            if(rear==size-1)
            {
                System.out.println("Queue is full");
                return;
            }

            rear++;
            arr[rear]=data;
        }

        //dequeue
        static int remove(){
            if(isEmpty())
            {
                System.out.println("Queue is empty");
                return -1;
            }

            int front=arr[0];
            for(int i=0;i<rear;i++)
            {
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }

        //peek
        static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Queue is empty");
                return -1;
            }

            int front=arr[0];
            return front;
        }
    }
    public static void main(String[] args) {
        queue q=new queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
}