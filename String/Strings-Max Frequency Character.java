import java.util.*;
public class Main {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
        }
        int max = 0;
        char ans = 'a';
        for (int i = 0; i < 26; i++) {
            if (freq[i] > max) {
                max = freq[i];
                ans = (char) (i + 'a');
            }
        }
        System.out.println(ans);
    }
}
