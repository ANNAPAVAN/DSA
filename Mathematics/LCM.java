class LCM 
{
    public static int lcm(int a,int b)
    {
        int k = Math.max(a,b);
        while(true)
        {
            if(k%a==0 && k%b==0)
            {
                return k;
            }
            k++;
        }
    }
    public static void main(String[] args)
    {
        System.out.println("LCM:"+lcm(14,6));
    }
}