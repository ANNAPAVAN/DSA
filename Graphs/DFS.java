import java.util.*;

class DFS 
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
    public static void DFSRec(ArrayList<ArrayList<Integer>> l,int s,boolean[] visited)
    {
        visited[s] = true;
        System.out.print(s+" ");
        for(int ap:l.get(s))
        {
            if(visited[ap]==false)
            {
                visited[ap]=true;
                DFSRec(l,ap,visited);
            }
        }
    }
    public static void DFS1(ArrayList<ArrayList<Integer>> l,int v,int s)
    {
        boolean visited[] = new boolean[v];
        for(int i=0;i<v;i++)
        {
            visited[i] = false;
        }
        DFSRec(l,s,visited);
    }
    public static void main(String... args)
    {
        int v=5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<v;i++)
        {
            adj.add(new ArrayList<Integer>());
        }
        addEdge(adj,0,1); 
        addEdge(adj,0,2); 
        addEdge(adj,2,3); 
        addEdge(adj,1,3); 
        addEdge(adj,1,4);
        addEdge(adj,3,4);
        printAdj(adj);
        System.out.println("");
        System.out.println("DFS");
        DFS1(adj,v,0);
    }
}