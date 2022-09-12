/*
Take N (number of rows), print the following pattern (for N = 4)

1
2 3
4 5 6
7 8 9 10

Input Format
Constraints
0 < N < 100

Output Format
Sample Input
4
Sample Output
1  
2	3  
4	5	6  
7	8	9	10
*/

//code
import java.util.*;
public class Main {
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 1;
        for(int i = 1 ; i<=n ; i++){
            for(int j = 1 ; j <= i ; j++)
            System.out.print(c++ + "    ");

            System.out.println();
            }
        }
}
        
