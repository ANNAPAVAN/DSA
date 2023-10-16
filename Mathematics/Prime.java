class Prime 
{
    public static boolean pr(int n)
    {
        if(n==1) return false;
        if(n==2 || n==3) return true;
        if(n%2==0 || n%3==0) return false;
        for(int i=5;i*i<=n;i=i+6)
        {
            if(n%i==0 || n%(i+2)==0)
                return false;
        }
        return true;
    }
    public static boolean p(int n)
    {
        if(n==1)
            return false;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;

    }
    public static void main(String[] args)
    {
        int n=101;
        // int f=0;
        // for(int i=2;i<n;i++)
        // {
        //     if(n%i==0)
        //     {
        //         f=1;
        //         break;
        //     }
        // }
        // if(f==0) System.out.println("prime");
        // else System.out.println("not prime");

        // System.out.println("Prime:"+p(n));

        System.out.println("Prime:"+pr(7));
    }
}