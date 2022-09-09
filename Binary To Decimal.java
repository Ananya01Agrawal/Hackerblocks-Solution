/*
Take N (number in binary format). Write a function that converts it to decimal format and Print the value returned.

Input Format
Constraints
0 < N <= 1000000000

Output Format
Sample Input
101010
Sample Output
42
Explanation
For binary number fedcba , Decimal number = f * 25 + e * 24 + d * 23 + …..+ a * 20.
*/

//code
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
		int mul=1;
		while(n>0) {
			sum=sum+(n%10)*mul;
			n=n/10;
			mul=mul*2;}
		System.out.println(sum);
			
			
		}

	}

