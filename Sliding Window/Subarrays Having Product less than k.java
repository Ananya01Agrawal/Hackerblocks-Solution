import java.util.*;
public class Main {
    public static void main (String args[]) {
         Scanner sc = new Scanner(System.in);
        int na = sc.nextInt();
        int ka = sc.nextInt();
        // taking inputs user
        int[] arr = new int[na];
        for(int i=0; i<na; i++) arr[i] = sc.nextInt();
        int si=0, ei=0;
        int ma = arr.length;
        int prod = 1;
        // taking aa as c
        int c=0;
        while(ei<ma){
            prod *= arr[ei];
            while(prod>=ka && si<=ei){
                prod/=arr[si];

                // k produce
                si++;
            }
            c+=(ei-si+1);
            ei++;
        }
        System.out.print(c);
// h produce
    }
}
