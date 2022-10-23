import java.util.Scanner;

public class Main {
    public static boolean check(int[] arr,int a,int b){
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(a%arr[i]==0) {
                c++;
            }
        }
        if(c>=b){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();// length ofarray
        int[] arr=new int[n];// new array
        for(int i=0;i<n;i++){// traversing
            arr[i]=sc.nextInt();
        }
        int q=sc.nextInt();
        while(q-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(check(arr,a,b)){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
