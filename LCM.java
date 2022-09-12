/*
ake the following as input.

A number (N1)
A number (N2)
Write a function which returns the LCM of N1 and N2. Print the value returned.

Input Format
Constraints
0 < N1 < 1000000000 0 < N2 < 1000000000

Output Format
Sample Input
4 
6
Sample Output
12
*/

//code
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N1=sc.nextInt();
        int N2=sc.nextInt();
        int i;
        int a=(N1>N2)?N1:N2;
        for(i=a;i<N1*N2;i=i+a){
            if(i%N1==0 && i%N2==0)
            break;
        }
        System.out.println(i);

    }
}
