

import java.util.*;

public class Subset {
    public static void func(int i, int n, int[] arr, List<Integer> cs, List<List<Integer>> res) {
       
        if (i == n) {
            res.add(new ArrayList<>(cs));
            return;
        }
        func(i + 1, n, arr, cs, res);
        cs.add(arr[i]);
        func(i + 1, n, arr, cs, res);
        cs.remove(cs.size() - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> t = new ArrayList<>();
        List<Integer> cs = new ArrayList<>();

        func(0, arr.length, arr, cs, t);

        // Print the subsets
        System.out.println(t);
       
    }
}
