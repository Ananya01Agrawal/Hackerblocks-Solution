/*
Take N (number of rows), print the following pattern (for N = 4)
0
1 1
2 3 5
8 13 21 34

Input Format
Constraints
0 < N < 100

Output Format
Sample Input
4
Sample Output
0 
1    1 
2    3     5 
8   13    21    34
*/

//code
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int row = 1, star = 1, a = 0, b = 1;

        while(row <= n){
            int col = 1;
            while(col <= star){
                int c = a + b;
                System.out.print(a + " ");
                a = b;
                b = c;
                col++;
            }
            System.out.println();
            star++;
            row++;
        }
    }
}
