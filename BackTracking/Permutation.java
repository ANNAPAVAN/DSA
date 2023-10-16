public class Permutation {
    public static String swap(String curr,int f,int l)
    {
        char[] ch=curr.toCharArray();
        char temp = ch[f];
        ch[f] = ch[l];
        ch[l] = temp;

        return new String(ch);
    }

    static void permute(int pos, int len, String curr_Str) {
        if (pos == len - 1) {
            System.out.println(curr_Str);
        }
        int i;
        for (i = pos; i < len; i++) {
            curr_Str = swap(curr_Str, pos, i);
            permute(pos + 1, len, curr_Str);
            curr_Str = swap(curr_Str, pos, i);
        }
    }

    public static void main(String[] pavan) {
        permute(0, 3, "123");
    }
}
