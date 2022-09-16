/*
ake the following as input.

A number (N1)
A number (N2)
Write a function which prints first N1 terms of the series 3n + 2 which are not multiples of N2.

Input Format
Constraints
0 < N1 < 100 0 < N2 < 100

Output Format
Sample Input
10 
4
Sample Output
5 
11 
14 
17 
23 
26 
29 
35 
38 
41
*/

//code

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N1=sc.nextInt();
        int N2=sc.nextInt();
        int i=1;
        int k=0;
        while(i>0){
            int num=(3*i)+2;
            if(num%N2!=0){
                System.out.println(num);
                k++;
                if(k==N1) break;
            }
            i++;
        }

    }
}
