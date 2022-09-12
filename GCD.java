/*
Take the following as input.

A number (N1)
A number (N2)
Write a function which returns the GCD of N1 and N2. Print the value returned.



Input Format
Two integers seperated by a new line.

Constraints
0 < N1 < 1000000000
0 < N2 < 1000000000

Output Format
Output a single integer which is the GCD of the given integers.

Sample Input
16 
24
Sample Output
8
*/

//code
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N1=sc.nextInt();
        int N2=sc.nextInt();
        int r=0, a, b;  
        a = (N1 > N2) ? N1 : N2;   
        b = (N1 < N2) ? N1 : N2;  
        r = b;  
        while(a % b != 0)  
        {  
            r = a % b;  
            a = b;  
            b = r;  
            }  
            System.out.println(r);

    }
}
