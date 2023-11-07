import java.util.*;
class Test 
{
    public static void addEdge(List<List<Integer>> adj,int u,int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    public static void main(String[] args)
    {
        int v=4;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<v;i++)
        {
            adj.add(new ArrayList<Integer>());
        }
        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,1,2);
        addEdge(adj,1,3);
        for(int i=0;i<v;i++)
        {
            System.out.println(adj.get(i));
        }
        boolean visited[] = new boolean[v];
        Queue<List<Integer>> q = new LinkedList<>();
        
    }
}