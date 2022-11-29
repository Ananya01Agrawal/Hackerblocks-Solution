import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String[] s=new String[n];
            for(int i=0;i<n;i++)
            {
                s[i]=sc.next();
            }
            String s = sc.next();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[s.charAt(i) - 'a']++;
            }
            int flag = 0;
            for(int i = 0; i < n; i++){
                if(arr[s.charAt(i) - 'a'] == 1){
                    System.out.println(s.charAt(i));
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                System.out.println("-1");
            }
        }
    }
}
