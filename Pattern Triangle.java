/*
Take N (number of rows), print the following pattern (for N = 4).

                       1 
                     2 3 2
                   3 4 5 4 3
                 4 5 6 7 6 5 4
Input Format
Constraints
0 < N < 10

Output Format
Sample Input
4
Sample Output
                        1
		2	3	2
	3	4	5	4	3
4	5	6	7	6	5	4
Explanation
Each number is separated from other by a tab.
*/

//code
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int  k = 0, count = 0, count1 = 0;

    for (int i = 1; i <= rows; ++i) {
      for (int space = 1; space <= rows - i; ++space) {
        System.out.print("  ");
        ++count;
      }

      while (k != 2 * i - 1) {
        if (count <= rows - 1) {
          System.out.print((i + k) + " ");
          ++count;
        } else {
          ++count1;
          System.out.print((i + k - 2 * count1) + " ");
        }

        ++k;
      }
      count1 = count = k = 0;

      System.out.println();
    }
  }
}

