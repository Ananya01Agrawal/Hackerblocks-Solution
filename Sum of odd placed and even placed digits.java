/*
ake N as input. Print the sum of its odd placed digits and sum of its even placed digits.

Input Format
Constraints
0 < N <= 1000000000

Output Format
Sample Input
2635
Sample Output
11
5

*/


//code
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sumOdd = 0, sumEven = 0, pos = 1;
 
        while (n != 0) {
 
            
            if (pos % 2 == 0)
                sumEven += n % 10;
            else
                sumOdd += n % 10;
            n /= 10;
            pos++;
        }
 
        System.out.println(sumOdd);
        System.out.println(sumEven);
    }
}
