import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long []cost=new long[n];
            long []l=new long[n];
            for(int i=0;i<n;i++){
                cost[i]=sc.nextLong();
            }
            for(int i=0;i<n;i++){
                l[i]=sc.nextLong();
            }
            long ans=0,money=Integer.MAX_VALUE;
            //int cost=0;
            //int petrol=0;
            for(int i=0;i<n;i++){
                if(cost[i]<money){
                    money=cost[i];
                    //petrol=petrol=l[i];
                    ans+=(money*l[i]);
                }
                else{
                    ans+=(money*l[i]);
                    //cost=cost+(l[i]-petrol)*c[i];
                    //petrol=0;
                }
            }
            System.out.println(ans);
        }

    }
}
