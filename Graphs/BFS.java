

import java.util.*;
public class BFS {
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
    public static void bfs1(ArrayList<ArrayList<Integer>> l,int v,int s)
    {
        boolean visited[] = new boolean[v];
        for(int i=0;i<v;i++)
        {
            visited[i] = false;
        }
        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.add(s);
        while(!q.isEmpty())
        {
            int u = q.poll();
            System.out.print(u + " ");
            for(int ap:l.get(u))
            {
                if(visited[ap]==false)
                {
                    visited[ap] = true;
                    q.add(ap);
                }
            }
        }
    }
    public static void main(String[] args)
    {
        int v=5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            adj.add(new ArrayList<Integer>());
        }
        addEdge(adj,0,1); 
    	addEdge(adj,0,2); 
    	addEdge(adj,1,2); 
    	addEdge(adj,2,3); 
    	addEdge(adj,1,3);
    	addEdge(adj,3,4);
    	addEdge(adj,2,4);
        printAdj(adj);
        System.out.println("BFS");
        bfs1(adj,v,0);
        // System.out.println("BFS");
        // bfs1(adj,v,1);
    }
}
