/*
Take N (number in decimal format). Write a function that converts it to octal format. Print the value returned.

Input Format
Constraints
0 < N <= 1000000000

Output Format
Sample Input
63
Sample Output
77
Explanation
Both input and output are integers
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
			sum=sum+(n%8)*mul;
			n=n/8;
			mul=mul*10;}
		System.out.println(sum);
			
			
		}

	}

     
