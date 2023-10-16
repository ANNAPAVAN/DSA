import java.util.*;
public class Activity_Selection
{
    public static void main(String[] arh)
    {
        int[][] a = {{3,8},{2,4},{1,3},{10,11},{6,6}};
        Arrays.sort(a,new MyComparator());
        for(int i=0;i<a.length;i++)
        {
            System.out.print("["+a[i][0]+","+a[i][1]+"]  ");
        }
        int res=1,j=0;
        for(int i=0;i<a.length-1;i++)
        {
            if(a[j][1]>a[i+1][0])
            {
                
                continue;
            }
            else
            {
                j=i;
                ++res;
            }
        }
        System.out.println("res:"+res);
    }
}

class MyComparator implements Comparator<int[]>
{
    public int compare(int a1[],int a2[])
    {
        // return Integer.compare(a1[1],a2[1]);
        return a1[1]-a2[1];
    }
}