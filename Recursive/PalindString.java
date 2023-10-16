// class PalindString {
//     static String s1 = "";

//     public static String pal(String s, int i) {
//         if (i < 0)
//             return "";
//         else
//             return s.charAt(i) + pal(s, i - 1);
//     }

//     public static void main(String[] args) {
//         String res = pal("pavan", 4);
//         System.out.println(res);
//     }
// }


class PalindString {
    

    public static boolean pal(String s, int st,int ed) {
        if (st>=ed)
            return true;
        
        return s.charAt(st)==s.charAt(ed) && pal(s,st+1,ed-1);
            
    }

    public static void main(String[] args) {
        boolean res = pal("pavapa", 0,5);
        System.out.println(res);
    }
}
