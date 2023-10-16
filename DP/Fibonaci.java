public class Fibonaci 
{
    // public static int fib(int n)
    // {
    //     if(n == 1 || n==0)
    //         return n;
    //     else
    //         return fib(n-1)+fib(n-2);
    // }
    private static int fib(int n){
        int m[] = new int[n+1];
        for (int i=0 ;i<m.length;i++)
        {
            m[i] = -1;
        }
        if(m[n]==-1)
        {
            if(n==0 || n==1)
            {
                return n;
            }
            else
            {
                return fib(n-1)+fib(n-2);
            }
        }
        return m[n];
    }
    public static void main(String[] pavan)
    {
        System.out.println("result:"+fib(10));
    }
}