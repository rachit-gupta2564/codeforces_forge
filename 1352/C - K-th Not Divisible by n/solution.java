import java.util.*;
public class cf1352c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            long l = 1, h = (n*k)/(n-1);
            long ans = 0;
            while(l <= h) {
                long mid = (l+h)/2;
                long d = mid/n;
                long nd = mid - d;
                if(nd < k) { 
                    l = mid + 1;
                }
                else {
                    ans = Math.max(ans, mid);
                    h = mid - 1;
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}