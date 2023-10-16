


// public class Main {
//     public static void powerSet(String s, int n, String res) {
//         if (n == s.length()) {
//             System.out.print(res + " ");
//             return;
//         }
        
//         powerSet(s, n + 1, res);
//         powerSet(s, n + 1, res + s.charAt(n));
//     }

//     public static void main(String[] args) {
//         powerSet("abc", 0, "");
//     }
// }

import java.util.*;
class Main
{
	public static void ps(int[] arr,int n,List<List<Integer>> res,List<Integer> l)
	{
		if(n==arr.length)
		{
			res.add(new ArrayList<>(l));
			return;
		}
		ps(arr,n+1,res,l);
		l.add(arr[n]);
		ps(arr,n+1,res,l);
		l.remove(l.size()-1);
	}
	public static void main(String args[])
	{
		int[] a = {1,2,3};
		List<List<Integer>> result = new ArrayList<>();
		ps(a,0,result,new ArrayList<>());
		System.out.println(result);
	}
}