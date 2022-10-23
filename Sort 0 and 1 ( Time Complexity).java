import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc  = new Scanner(System.in);// taking gthe imput from the user
        int n = sc.nextInt();

        int a[] = new int[n];

        for(int i = 0 ; i<n ; i++){
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);// using the sort function to sort the array
        
        for(int i = 0 ; i<n ; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        // Your Code Here
    }
}
