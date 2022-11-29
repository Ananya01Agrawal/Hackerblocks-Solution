import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i = 0;
        int sum = 0;
        int count = 0;
        while(true){
            int x = sc.nextInt();
            if(x == -1){
                break;
            }
            if(count < n){
                arr[i] = x;
                sum += x;
                count++;
                System.out.printf("%.4f ", (float)sum/count);
            }
            else{
                sum -= arr[i];
                arr[i] = x;
                sum += x;
                System.out.printf("%.4f ", (float)sum/count);
            }
            i = (i+1)%n;
        }
    }
}
