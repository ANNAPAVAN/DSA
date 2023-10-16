public class SumN 
{
    public static int fib(int n)
    {
        if(n==1)
            return 1;
        else
            return n+fib(n-1);
    }
    public static void main(String[] pav)
    {
        System.out.println("+++"+fib(100));
    }
}