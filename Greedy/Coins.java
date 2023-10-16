public class Coins
{
    public static void main(String[] args)
    {
        int nums[]={10,5,2,1};
        int amt=55;
        int r=0,i=0;
        while(i<4)
        {
            if(amt==0) break;
            if(nums[i]<=amt)
            {
                int k = (int)(amt/nums[i]);
                r = r + k;
                amt = amt - k*nums[i];
                i++;
            }
            else
            {
                i++;
            }
        }
        System.out.println("coins:"+r);
    }
}