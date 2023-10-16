import java.util.*;
public class DLL
{
    static Scanner sc = new Scanner(System.in);
    static Node head;
    static Node tail;
    static class Node 
    {
        int data;
        Node prev;
        Node next;
        public Node(int d)
        {
            data = d;
            prev = null;
            next = null;
        }
    }
    public static DLL create(DLL l,int d)
    {
        Node n = new Node(d);
        if(l.head == null)
        {
            head = n;
            tail = head;
            return l;
        }
        else 
        {
            Node temp = l.head;
            Node b = null;
            while(temp.next!=null)
            {
                b=temp;
                temp = temp.next;
                temp.prev = b;
                b.next = temp;
            }
            temp.next = n;
            tail = temp.next;
            tail.prev = temp;
            tail.next = null;
        }
        return l;
    }
    // public static void insert(DLL l)
    // {
    //     System.out.println("\nInsert at \n1.begining\n2.end\n3.B/W\n");
    //     int k = sc.nextInt();
    //     System.out.println("enter data:");
    //     int d1 = sc.nextInt();
    //     Node nn = new Node(d1);
    //     Node temp = l.head;
        
    //     switch(k)
    //     {
    //         case 1:
    //             nn.next = l.head;
    //             head = nn;
    //             break;
    //         case 2:
    //             tail.next = nn;
    //             tail = nn;
    //             break;
    //         case 3:
    //             Node before = null;
    //             temp = l.head;
    //             Node after = temp;
                
    //             System.out.println("enter position:");
    //             int pos = sc.nextInt();
    //             int i = 1;
    //             while(pos!=i)
    //             {
    //                 before = temp;
    //                 temp = temp.next;
    //                 after = temp;
    //                 i++;
    //             }
    //             nn.prev = before;
    //             nn.next = after;    
    //             before.next = nn;
    //             after.prev = nn;
    //             break;    
    //     }
    // }
    public static void delet(DLL l,int d)
    {
        if(head.data == d)
        {
            head = head.next;
            return;
        }
        if(tail.data == d)
        {
            tail = tail.prev;
            tail.next = null;
            return;
        }
        Node temp = l.head;
        Node before = null;
        Node after = temp;
        while(temp.data!=d)
        {
            before = temp;
            temp = temp.next;
            after = temp;
        }
        before.next = after.next;
        after.next.prev = before;

    }
    public static void display(DLL l)
    {
        System.out.println("\nDLL:");
        Node nn = l.head;
        while(nn!=null)
        {
            System.out.print(nn.data+" ");
            nn=nn.next;
        }
    }

    public static void main(String arhs[])
    {
        DLL l = new DLL();
        l.create(l,10);
        l.create(l,20);
        l.create(l,30);
        l.create(l,40);
        display(l);
        // insert(l);
        // display(l);
        // delet(l,10);
        // display(l);
        // delet(l,40);
        // display(l);
        delet(l,20);
        display(l);
    }
}