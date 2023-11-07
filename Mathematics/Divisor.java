// class Divisor 
// {
//     // public static void 
//     public static void main(String arg3[])
//     {
//         int n=25;
//         for(int i=1;i*i<=n;i++)
//         {
//             if(n%i==0)
//             {
//                 System.out.print(" "+i);
//                 if(i!=n/i)
//                 {
//                     System.out.print(" "+n/i);
//                 }
//             }
           
//         }
//     }
// }

import java.util.*;
class Divisor 
{
    public static void main(String args[])
    {
        int n = 32;
        TreeSet<Integer> l = new TreeSet<>();
        for(int i=1;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                l.add(i);
                l.add(n/i);
            }
        }
        System.out.println(l);
    }
}