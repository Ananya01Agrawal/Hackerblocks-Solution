import java.util.*;
public class Main {
    public static int mss(int[]arr) {
        int totalsum=0;// initialiazing the total sum as zero
        // traversing the array
        for(int i=0;i<arr.length;i++){
            totalsum+=arr[i];
        }

        int sum=0;
        int maxsum=0;
        int minsum=0;
        int msum=0;
        for(int i=0;i<arr.length;i++){
            sum=Math.max(arr[i],sum+arr[i]);
            maxsum=Math.max(sum,maxsum);

            msum=Math.min(arr[i],msum+arr[i]);
            minsum=Math.min(msum,minsum);
        }
        if(minsum==totalsum){
            return maxsum;
        }
        return Math.max(maxsum,totalsum-minsum);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[]arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(mss(arr));

    }

    }
}
