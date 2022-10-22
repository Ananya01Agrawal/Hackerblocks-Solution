import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int[] ans=new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                ans[c]=arr[i];
                c++;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                ans[c]=arr[i];
                c++;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]==2){
                ans[c]=arr[i];
                c++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(ans[i]+" ");
        }
    }
}
