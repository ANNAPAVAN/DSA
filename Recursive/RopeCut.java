
public class RopeCut {
    public static int fun(int num,int a,int b,int c)
    {
        if(num==0) return 0;
        if(num<0) return -1;
        int res = Math.max(Math.max(fun(num-a,a,b,c),fun(num-b,a,b,c)),fun(num-c,a,b,c));
        if(res==-1) return -1;
        return res+1;
    }    
    public static void main(String[]args)
    {
        int res = fun(23,11,9,12);
        // int res = fun(5,2,5,1);
        System.out.println(res);
    }
}
