import java.util.*;
 
public class AC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        String s = sc.next();
 
        Stack<Character> st = new Stack<>();
 
        for (char c : s.toCharArray()) {
            if (!st.isEmpty() && st.peek() == c) {
                st.pop();
            } else {
                st.push(c);
            }
        }
 
        if (st.isEmpty())
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}