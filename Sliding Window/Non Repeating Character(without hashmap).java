import java.util.*;
class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            
            String s = sc.next();
            int[] arr = new int[26];
            for(int i = 0; i < s.length(); i++){
                arr[s.charAt(i) - 'a']++;
            }
            int flag = 0;
            for(int i = 0; i < s.length(); i++){
                if(arr[s.charAt(i) - 'a'] == 1){
                    System.out.println(s.charAt(i));
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                System.out.println(-1);
            }
        }
    }
}
