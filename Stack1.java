import java.util.*;
class Stack1
{
    static Scanner sc=new Scanner(System.in);
    static Node top;
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
    public static void isEmpty(Stack1 s)
    {
        if(top==null)
        {
            System.out.println("empty");
        }
        else 
        {
            System.out.println("not empty");
        }
    }
    public static void peek(Stack1 s)
    {
        if(top!=null)
        {
            System.out.println(top.data);
        }
        else{
            System.out.println("empty");
        }
    }
    public static void push(int d)
    {
        Node n = new Node(d);
        if(top==null)
        {
            top = n; 
        }
        else 
        {
            n.next = top;
            top = n;
        }
    }
    public static void pop()
    {
        if(top==null)
        {
            System.out.println("empty");
            return;
        }
        top = top.next;
    }
    public static void display(Stack1 s)
    {
        Node temp = top;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] pavan)
    {
        Stack1 s1 = new Stack1();
        push(10);
        push(20);
        push(30);
        display(s1);
        peek(s1);
        isEmpty(s1);
        pop();
        pop();
        pop();
        pop();
        pop();
    }
}