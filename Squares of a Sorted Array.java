import java.util.*;
public class Main {
      public static void printArray(int[] a){
        for(int i = 0 ;i<a.length ; i++){
            a[i] = a[i]*a[i];
           
        }
      
    }
    public static void main (String args[]) {
  Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int a[] = new int[n];
    for(int i = 0 ; i<n ; i++){
        a[i] = sc.nextInt();
    }
printArray(a);
   
        for(int i = 0 ;i<n-1 ; i++){
            for(int j = 0; j<n-i-1; j++){
             if(a[j]>a[j+1]){
  int temp = a[j];
             a[j] = a[j+1];
             a[j+1] = temp;
             }
           
    }
        }
  for(int i = 0 ; i<n ; i++){
       System.out.print(a[i]+" ");
  }
    }
}
