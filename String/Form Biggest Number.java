import java.util.*;
public class Main {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.next();
            }
            Arrays.sort(arr, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    String a = o1 + o2;
                    String b = o2 + o1;
                    return b.compareTo(a);
                }
            });
            for (String s : arr) {
                System.out.print(s);
            }
            System.out.println();
        }
    }
}
