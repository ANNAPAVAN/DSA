// public class AllPrime {
//     public static boolean isPrime(int n)
//     {
//         if(n==1) return false;
//         if(n==2 || n==3)
//         {
//             return true;
//         }
//         if(n%2==0 || n%3==0)
//         {
//             return false;
//         }
//         for(int i=5;i*i<=n;i=i+6)
//         {
//             if(n%i==0||n%(i+2)==0)
//             {
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String args[])
//     {
//         int n =25;
//         for(int i=1;i<=n;i++)
//         {
//             if(isPrime(i))
//             {
//                 System.out.print(i+" ");
//             }
//         }
//     }
// }

// -------------------------------------------------------------------------------------------------------------------------------------------

public class AllPrime
{
    public static void m1(boolean b[],int k,int n)
    {
        for(int i=k+1;i<b.length;i++)
        {
            if(!b[i])
            {
                if(i%k==0)
                {
                    b[i]=true;
                }
            }
        }
    }
    public static void main(String []args)
    {
        int n=25;
        boolean b[] = new boolean[n+1];
        for(int i=2;i<=n;i++)
        {
            m1(b,i,n);
        }
        for(int i=2;i<=n;i++)
        {
            if(!b[i])
            {
                System.out.print(i+" ");
            }
        }
    }
}
