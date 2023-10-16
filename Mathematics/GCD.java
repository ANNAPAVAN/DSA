class GCD 
{
    public static int gcd(int a , int b)
    {
        if(b==0)
        {
            return a;
        }
        else
        {
            return gcd(b,a%b);
        }
    }
    public static void main(String[] args)
    {
        int n1 = 24;
        int n2 = 32;
        int g=1;
        int r = Math.min(n1,n2);
        // for(int i=1;i<=r;i++)
        // {
        //     if(n1%i==0 && n2%i==0) 
        //     {
        //         g = i;
        //     } 
        // }

        // -------------------------------

        // for(int i=r;i>0;i--)
        // {
        //     if(n1%i==0 && n2%i==0) 
        //     {
        //         g = i;
        //         break;
        //     } 
        // }
        // System.out.println("GCD:"+g);
        // System.out.println("LCM:"+(n1*n2)/g);

        // -----------------------------
        // while(n1!=n2)
        // {
        //     if(n1>n2)
        //         n1 = n1-n2;
        //     else
        //         n2 = n2 - n1;
        // }
        // System.out.println("GCD:"+n1);

        // -------------------------------

        System.out.println("GCD:"+gcd(n1,n2));

       
    }
}