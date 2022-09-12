/*
Take N as input, Calculate it's reverse also Print the reverse.

Input Format
Constraints
0 <= N <= 1000000000

Output Format
Sample Input
123456789
Sample Output
987654321
*/

//code

import java.util.*;
public class Main {
    public static void main(String args[]) {
        int num=0;
        int rev =0;
      
      Scanner in = new Scanner(System.in);
      
      num = in.nextInt();
      
      while( num != 0 )
      {
          rev = rev * 10;
          rev = rev + num%10;
          num = num/10;
      }

      System.out.println(rev);
   }
}
