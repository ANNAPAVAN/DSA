import java.util.*;
public class DetectCycle {
    public static void addEdge(ArrayList<ArrayList<Integer>> l,int u,int v)
    {
        l.get(u).add(v);
        l.get(v).add(u);
    }
    public static void printAdj(ArrayList<ArrayList<Integer>> adj)
    {
        for(int i=0;i<adj.size();i++)
        {
            for(int j=0;j<adj.get(i).size();j++)
            {
                System.out.print(adj.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
    public static void DFS(ArrayList<ArrayList<Integer>> adj ,int s,boolean[] visited)
    {
        visited[s] = true;
        System.out.print(s+" ");
        for(int ap:adj.get(s))
        {
            if(!visited[ap])
            {
                visited[ap]=true;
                DFS(adj,ap,visited);
            }
        }
    }
    public static void main(String[] args)
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
        boolean visited[] = new boolean[v];
        for(int i=0;i<v;i++)
        {
            visited[i]= false;
        } 
        int s=0;
        System.out.println();
        DFS(adj,s,visited);

    }
}
