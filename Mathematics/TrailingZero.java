class TrailingZero 
{
    public static void main(String arg[])
    {
        int n=251;
        // int res = n/5 + n/25 + n/125 + n/625;
        int res = 0;
        for(int i=5;i<=n;i=i*5)
        {
            res = res + n/i;
        }
        System.out.println("No. of trailing zeros:"+res); 
        
    }
}