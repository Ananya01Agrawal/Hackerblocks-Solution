import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int max=a[n-1]*a[n-2]*a[n-3];
        int min=a[0]*a[1]*a[n-1];
        System.out.println(Math.max(max,min));
    }
}
