import java.util.*; 
public class Main { 
    public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        int m = sc.nextInt(); 
        int[][] arr = new int[n][m]; 
        for(int i = 0; i < n; i++) { 
            for(int j = 0; j < m; j++) { 
                arr[i][j] = sc.nextInt(); 
            } 
        } 
        int x = sc.nextInt(); 
        int i = 0; 
        int j = m - 1; 
        while(i < n && j >= 0) { 
            if(arr[i][j] == x) { 
                System.out.println(1); 
                return; 
            } 
            else if(arr[i][j] > x) { 
                j--; 
            } 
            else { 
                i++; 
            } 
        } 
        System.out.println(0); 
    } 
}
