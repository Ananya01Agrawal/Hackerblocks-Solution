import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            int k = sc.nextInt();
            String temp = name.substring(start-1,end);
            for(int j=0;j<k;j++){
                temp = temp.substring(temp.length()-1) + temp.substring(0,temp.length()-1);
            }
            name = name.substring(0,start-1) + temp + name.substring(end);
        }
        System.out.println(name);
    }
}
