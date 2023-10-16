import java.util.*;

public class Combination {
    public static List<List> combinationSum(int[] l,int t)
    {
        List<List> r1 = new ArrayList();
        Arrays.sort(l);
        back_track(l,0,t,new ArrayList(),r1);
        return r1;
    }
    public static void back_track(int[] l, int st, int t,List l1,List<List> r1)
    {
        if(t<0) return;
        if(t==0) r1.add(new ArrayList(l1));
        for(int i=st;i<l.length;i++)
        {
            l1.add(l[i]);
            back_track(l,i,t-l[i],l1,r1);
            l1.remove(l1.size()-1);
        }
    }
    public static void main(String[] args)
    {
        int[] nums = {2,3,5};
        int target = 8;
        List<List> res = combinationSum(nums,target);
        System.out.println(res);
    }
}
