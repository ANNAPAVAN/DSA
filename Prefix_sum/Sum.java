import java.util.*;
class Sum 
{
    public static void main(String args[])
    {
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        for(int i=1;i<a.length;i++)
        {
            a[i] = a[i]+a[i-1];
        }
        System.out.println("array:"+Arrays.toString(a));
        System.out.println("sum for index 2 to 9 is "+(a[9]-a[1]));
    }
}