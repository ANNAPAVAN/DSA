// public class MyFact 
// {
//     public static int fact(int n)
//     {
//         if(n==0||n==1)
//             return 1;
//         else 
//             return n*fact(n-1);
//     }
//     public static void main(String[] args)
//     {
//         System.out.println(fact(5));
//     }
// }


//Tail Recursion
public class MyFact 
{
    public static int fact(int n,int k)
    {
        if(n==0||n==1)
            return k;
        else 
            return fact(n-1,n*k);
    }
    public static void main(String[] args)
    {
        System.out.println(fact(13,1));
    }
}
