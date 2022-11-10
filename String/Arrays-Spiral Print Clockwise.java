import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int a[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int startRow=0;
        int endRow=m-1;
        int startCol=0;
        int endCol=n-1;
        while(startRow<=endRow && startCol<=endCol){
            for(int i=startCol;i<=endCol;i++){
                System.out.print(a[startRow][i]+", ");
            }
            startRow++;
            for(int i=startRow;i<=endRow;i++){
                System.out.print(a[i][endCol]+", ");
            }
            endCol--;
            if(startRow<=endRow){
                for(int i=endCol;i>=startCol;i--){
                    System.out.print(a[endRow][i]+", ");
                }
                endRow--;
            }
            if(startCol<=endCol){
                for(int i=endRow;i>=startRow;i--){
                    System.out.print(a[i][startCol]+", ");
                }
                startCol++;
            }
        }
        System.out.println("END");
    }
}
