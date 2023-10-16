class PrimeFactor 
{
    public static boolean prime(int n)
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
    public static void main(String[] args)
    {
        int r=1119341632;
        // for(int i=2;i<=100;i++)
        // {
        //     if(prime(i))
        //     {
        //         int x=i;
        //         while(r%x==0)
        //         {
        //             System.out.println(i+" ");
        //             x=x*i;
        //         }
        //     }
        // }
        int i=2;
        while(r!=1)
        {
            if(prime(i))
            {
                int x=i;
                while(r%i==0)
                {
                    System.out.println(i+" ");
                    r = r/i;
                }
            }
            i++;
        }
     
    }
}