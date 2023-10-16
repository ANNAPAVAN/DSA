
// package BinarySearch;
import java.util.*;
public class Count1 {
    public static int fun(int a[],int l,int r,int res)
    {
        if(l>r) return res;
        int m = l+(r-l)/2;
        if(a[m]==0)
        {
            res = res+(m-l)+1;
            return fun(a,m+1,r,res);
        }
        return fun(a,l,m-1,res);   
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1};
        int r = fun(arr,0,arr.length-1,0);
        System.out.println(arr.length-r);
    }
}
