import java.util.*;
class CLL
{
    static Scanner sc = new Scanner(System.in);
    static Node head;
    static Node tail;
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
    public static void create(CLL l,int d)
    {
        Node nn =new Node(d);
        if(head == null)
        {
            head = nn;
            tail = nn;
            head.next = head;
            return;
        }
        else 
        {
            Node temp = head;
            while(temp.next!=head)
            {
                temp =temp.next;
            }
            temp.next = nn;
            tail = nn;
            nn.next = head;
        }

    }
    public static void display(CLL l)
    {
        Node t = head;
        do
        {
            System.out.print(t.data+" ");
            t=t.next;
        }while(t!=head);
    } 
    public static void insert(CLL l , int d)
    {
        System.out.println("\nInsert at:\n1.Begining\n2.End\n3.B/W");
        int ch = sc.nextInt();
        Node nn = new Node(d);
        switch(ch)
        {
            case 1:
                nn.next = head;
                head = nn;
                tail.next = head;

                break;
            case 2:
                tail.next = nn;
                tail = nn;
                tail.next = head;
                break;
            case 3:
                System.out.println("Enter pos:");
                int pos = sc.nextInt();
                Node t1 = head;
                int i=1;
                while(pos!=i)
                {
                    t1 = t1.next;
                    i++;
                }
                nn.next = t1.next;
                t1.next = nn;
                break;
        }
    }
    public static void delet(int d)
    {
        if(head.data == d)
        {
            head = head.next;
            tail.next = head;
            return;
        }
        Node temp = head;
        Node b = null;
        while(temp.data!=d)
        {
            b=temp;
            temp = temp.next;
        }
        b.next = temp.next;
        temp = null;

    }
    public static void main(String[] pav)
    {
        CLL l = new CLL();
        create(l,10);
        create(l,20);
        create(l,30);
        display(l);
        // insert(l,200);
        // display(l);
        System.out.println("\n");
        delet(20);
        display(l);

    }
}