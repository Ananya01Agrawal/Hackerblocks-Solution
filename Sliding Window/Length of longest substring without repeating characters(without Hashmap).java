import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int ans = 0;
        int i = 0;
        int j = 0;
        HashSet<Character> set = new HashSet<>();
        while(i < n && j < n){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else{
                set.remove(s.charAt(i++));
            }
        }
        System.out.println(ans);
    }
}
