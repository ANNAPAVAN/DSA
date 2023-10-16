public class Queue1
{
    static Node front;
    static Node back;
    static class Node 
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    public static void push(int d)
    {
        Node n = new Node(d);
        if(front==null)
        {
            front = n;
            back = front;
            return;
        }
        back.next = n;
        back = n;
    }
    public static void pop()
    {
        if(front == null)
        {
            System.out.println("empty");
            return;
        }
        else
        {
            front = front.next;
        }
    }
    public static void display(Queue1 q)
    {
        Node temp = front;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args)
    {
        Queue1 q = new Queue1();
        push(10);
        push(20);
        push(30);
        display(q);
        System.out.println();
        pop();
        display(q);
    }
}