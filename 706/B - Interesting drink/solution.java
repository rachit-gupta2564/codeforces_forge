import java.util.*;
public class cf706b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        for(int i = 0; i < n; i ++) {
            x[i] = sc.nextInt();
        }
        Arrays.sort(x);
        int q = sc.nextInt();
        for(int i = 0; i < q; i ++) {
            int m = sc.nextInt();
            Search(x, m);
        }
        sc.close();
    }
    public static void Search(int[] x, int m) {
        int c = 0, ans = 0;
        int l = 0, r = x.length - 1;
        while(l <= r) {
            int mid = (l+r)/2;
            if(x[mid] <= m) {
                c = mid + 1;
                l = mid + 1;
            }else {
                r = mid - 1;
            }
        }
        System.out.println(c);
    }
}