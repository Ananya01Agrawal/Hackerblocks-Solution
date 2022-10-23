import java.util.*;
public class Main {
	public static void printpair(int[] arr,int dr){
		Arrays.sort(arr);
		int r1=0,r2=0;
		int min=Integer.MAX_VALUE,c=0,diff=0;
		for(int i=0;i<arr.length;i++){
		

			for(int j=i+1;j<arr.length;j++){
				if(arr[i]+arr[j]==dr){
					
					 diff=Math.abs(arr[i]-arr[j]);
					 if(diff<min){
						 min=diff;
						 r1=arr[i];
						 r2=arr[j];
					 }
					

				}
			}
		
		}
		System.out.println("Deepak should buy roses whose prices are "+r1+" and "+r2+".");
	}
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}
			int deepkM=sc.nextInt();//
			
			printpair(arr,deepkM);
		
		}
    }
}
