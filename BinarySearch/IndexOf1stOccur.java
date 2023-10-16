// package BinarySearch;
import java.util.*;
public class IndexOf1stOccur {
    public static int fun(int a[],int val,int l,int r)
    {
        int m = l + (r-l)/2;
        if(l>r) return m;

        if(val>a[m])
        {
            return fun(a,val,m+1,r);
        }
        else if(val<a[m])
        {
            return fun(a,val,l,m-1);
        }
        
        if(val==a[m-1])
        {
            return fun(a,val,l,r-1);
        }
        return m;
    }
    public static void main(String[] args)
    {
        int a[] = {0,1,1,1,2,2,4};
        int res = fun(a,1,0,a.length-1);
        System.out.println(res);
    }
}
