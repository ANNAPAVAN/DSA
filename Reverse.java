import java.util.*;
public class Reverse 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int s[]={1,2,3,4,5};
        int start = 0;
        int end = s.length-1;
        while(start<end)
        {
            int t = s[start];
            s[start] = s[end];
            s[end]= t;
            start++;
            end--;
        }
        System.out.println("Reverse:"+Arrays.toString(s));
    }
}