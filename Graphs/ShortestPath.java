
import java.util.*;
public class ShortestPath {
    public static void addEdge(List<List<Integer>> l,int u,int v)
    {
        l.get(u).add(v);
        l.get(v).add(u);
    }
    public static void BFS(List<List<Integer>> l,int v,int s,int[] dist)
    {
        boolean[] visited= new boolean[v];
        for(int i=0;i<v;i++)
        {
            visited[i] = false;
        }
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        visited[s]= true;
        System.out.print("BFS: ");
        while(!q.isEmpty())
        {
            int ap = q.poll();
            System.out.print(ap+" ");
            for(int a:l.get(ap))
            {
                if(visited[a]==false)
                {
                    dist[a] = dist[ap]+1;
                    visited[a]=true;
                    q.add(a);
                }
            }
        }
        System.out.println();
        System.out.println("Dist: "+Arrays.toString(dist));
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
    	addEdge(adj,1,2); 
    	addEdge(adj,2,3); 
    	addEdge(adj,0,2); 
    	addEdge(adj,1,3);
        System.out.println("Adjacency list: "+adj);
        int dist[] = new int[v];
        for(int i=0;i<v;i++)
        {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[0] = 0;
        BFS(adj,v,0,dist);
        

    }
}
