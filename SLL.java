import java.io.*;
public class SLL 
{
    static Node head;
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

    public static SLL insert(SLL l,int d) 
    {
        Node n = new Node(d);
        if(l.head == null)
        {
            head = n;
            return l;
        }
        else 
        {
            Node temp = l.head;
            while(temp.next!=null)
            {
                temp = temp.next;
            }
            temp.next = n;
        }
        return l;
    }
    public static void display(SLL l)
    {
        System.out.println("\nLL:");
        Node nn = l.head;
        while(nn!=null)
        {
            System.out.print(nn.data+" ");
            nn=nn.next;
        }
    }
    public static void reverse(SLL l)
    {
        Node prev = null;
        Node temp = head;
        Node curr = temp;
        do 
        {
            temp = temp.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }while(temp.next!=null);
        temp.next = prev;
        head = temp;
    }

    public static void delet(int d)
    {
        Node temp=head;
        if(temp.data==d)
        {
            head = head.next;
            return;
        }
        Node b = null;
        while(temp.data!=d)
        {
            b = temp;
            temp=temp.next;
        }
        if(b.next.next == null)
        {
            b.next = null;
            return;
        }
        temp.next = temp.next.next;
    }
    public static void main(String []pavan)
    {
        SLL l = new SLL();

        l.insert(l,10);
        l.insert(l,20);
        l.insert(l,30);
        l.insert(l,40);
        l.insert(l,50);
        display(l);
        // delet(30);
        // display(l);
        // delet(10);
        // display(l);
        // delet(50);
        // display(l);
        reverse(l);
        display(l);
    }
}