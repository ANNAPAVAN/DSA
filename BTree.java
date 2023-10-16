import java.util.LinkedList;
import java.util.Queue;

public class BTree {
    static Node root;

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int d) {
            data = d;
            left = null;
            right = null;
        }
    }

    public static void printInord(Node temp) {
        if (temp == null)
            return;
        printInord(temp.left);
        System.out.print(temp.data + " ");
        printInord(temp.right);
    }

    public static void printPreord(Node temp) {
        if (temp == null)
            return;
        System.out.print(temp.data + " ");
        printPreord(temp.left);
        printPreord(temp.right);
    }

    public static void printPostord(Node temp) {
        if (temp == null)
            return;
        printPostord(temp.left);
        printPostord(temp.right);
        System.out.print(temp.data + " ");
    }

    public static void printLevord(Node n) {
        if (n == null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(n);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + " ");

            if (current.left != null)
                queue.offer(current.left);
            if (current.right != null)
                queue.offer(current.right);
        }
    }

    public static int ht(Node n) {
        if (n == null)
            return 0;
        else
            return Math.max(ht(n.left), ht(n.right)) + 1;
    }

    public static void Dist(Node n,int k)
    {
        if(n==null) return;
        if(k==0) 
        {
            System.out.print(n.data+" ");
        }
        else
        {
            Dist(n.left,k-1);
            Dist(n.right,k-1);
        }
        
    }

    public static int size(Node n)
    {
        if(n==null)
            return 0;
        else
            return 1+size(n.left)+size(n.right);
    }

    public static int maxx(Node n)
    {
        if(n==null)
            return 0;
        else 
            return Math.max(n.data,Math.max(maxx(n.left),maxx(n.right)));
        
    }

    public static void main(String[] args) {
        root = new Node(1);
        root.left = new Node(7);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(2);

        // System.out.println("In order:");
        // printInord(root);

        // System.out.println("\nPre order:");
        // printPreord(root);

        // System.out.println("\nPost order:");
        // printPostord(root);

        // System.out.println("\nLevel order:");
        // printLevord(root);

        // System.out.println("\nHeight: " + ht(root));

        // System.out.println("\nNumber at dist 2:");
        // Dist(root,2);

        // LEVEL ORDER
        // System.out.println("\nNumber at dist :");
        // for(int i=0;i<3;i++)
        // {
        //     System.out.println();
        //     Dist(root,i);
        // }
        // System.out.println("\nNumber at Nodes in Tree :"+size(root));

        System.out.println("\nMax Node value in Tree :"+maxx(root));
           
    }
}
