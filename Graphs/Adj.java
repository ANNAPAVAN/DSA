
import java.util.*;
public class Adj
{
    public static void addEdge(ArrayList<ArrayList<Integer>> l,int u,int v)
    {
        l.get(u).add(v);
        l.get(v).add(u);
    }
    public static void printAdj(ArrayList<ArrayList<Integer>> l)
    {
        for(int i=0;i<l.size();i++)
        {
            for(int j=0;j<l.get(i).size();j++)
            {
                System.out.print(l.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        int v=4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<v;i++)
        {
            adj.add(new ArrayList<Integer>());
        }
        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,1,2);
        addEdge(adj,1,3);
        
        
        printAdj(adj);

    }
}