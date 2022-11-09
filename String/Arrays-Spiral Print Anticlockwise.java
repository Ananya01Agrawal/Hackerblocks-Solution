import java.util.*;
public class Main {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                arr[i][j] = sc.nextInt();
            }
        }
        int minr = 0;
        int minc = 0;
        int maxr = m - 1;
        int maxc = n - 1;
        int tne = m * n;
        int cnt = 0;
        while (cnt < tne) 
        {
            //left wall
            for (int i = minr, j = minc; i <= maxr && cnt < tne; i++) 
            {
                System.out.print(arr[i][j] + ", ");
                cnt++;
            }
            minc++;
            //bottom wall
            for (int i = maxr, j = minc; j <= maxc && cnt < tne; j++) 
            {
                System.out.print(arr[i][j] + ", ");
                cnt++;
            }
            maxr--;
            //right wall
            for (int i = maxr, j = maxc; i >= minr && cnt < tne; i--) 
            {
                System.out.print(arr[i][j] + ", ");
                cnt++;
            }
            maxc--;
            //top wall
            for (int i = minr, j = maxc; j >= minc && cnt < tne; j--) 
            {
                System.out.print(arr[i][j] + ", ");
                cnt++;
            }
            minr++;
        }
        System.out.println("END");
    }
}
