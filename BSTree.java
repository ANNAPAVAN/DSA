public class BSTree 
{
    static Node root;
    static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int d)
        {
            data = d;
            left = null;
            right = null;
        }
    }

    public static void insert(Node temp,int d)
    {
        Node nn = new Node(d);
        
        if(temp == null)
        {
            root = nn;
        }
        else if(d < temp.data)
        {
            if(temp.left == null)
            {
                temp.left = nn;
            }
            else
            {
                temp = temp.left;
                insert(temp,d);
            }
        }
        else 
        {
            if(temp.right == null)
            {
                temp.right = nn;
            }
            else
            {
                temp = temp.right;
                insert(temp,d);
            }
        }
    }

    public static void printInord(Node temp)
    {
        if(temp == null)
            return;
        printInord(temp.left);
        System.out.print(temp.data+" ");
        printInord(temp.right);
    }

    public static void Search(Node temp,int d)
    {
        if(temp==null)
        {
            System.out.println("\nNot Found");
            return;
        }
        if(temp.data == d)
        {
            System.out.println("Found");
            return;
        }
        else if(d < temp.data)
        {
            Search(temp.left,d);
        }
        else
        {
            Search(temp.right,d);
        }
        
    }


    public static void main(String[] pavan)
    {
        insert(root,2);
        insert(root,12);
        insert(root,5);
        insert(root,9);
        insert(root,8);
        insert(root,1);
        insert(root,11);
        insert(root,13);
        insert(root,10);
        System.out.println("Inorder");
        printInord(root);
        Search(root,50);
        Search(root,5);
    }
}