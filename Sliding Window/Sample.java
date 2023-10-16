class Sample {
    public static void main(String[] args) {
        int k = 3;
        int[] a = {2, 1, 4, 5, 6, 3, 1, 4, 2, 5};
        int l = 0, r = 0;
 
        int n = a.length,res=0,csum = 0;
        
        for (int i = 0; i < n; i++) {
            csum += a[i];
                while(i-l>=k-1){
                    res = Math.max(res,csum);
                    csum -= a[l];
                    l++;
                }
        }
        
        System.out.println("max sum_gfhtgruhrht: " + res);
    }
}

// class Sample {
//     public static void main(String[] args) {
//         int k = 3;
//         int[] a = {2, 1, 4, 5, 6, 3, 1, 4, 2, 5};
//         int s1 = 0;
        
//         for (int i = 0; i < k; i++) {
//             s1 = s1 + a[i];
//         }
        
//         int m = s1; 
//         System.out.println(":" + s1);
//         int l = a.length;
        
//         for (int i = k; i < l; i++) {
//             s1 = s1 - a[i - k] + a[i];
//             System.out.println(":" + s1);
            
//             if (s1 > m) {
//                 m = s1;
//             }
//         }
        
//         System.out.println("max sum: " + m);
//     }
// }
