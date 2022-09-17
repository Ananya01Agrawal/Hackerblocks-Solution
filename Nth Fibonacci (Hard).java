/*
Take N as input. Print Nth Fibonacci Number, given that the first two numbers in the Fibonacci Series are 0 and 1.

Input Format
Constraints
0 <= N <= 1000

Output Format
Sample Input
10
Sample Output
55
Explanation
The 0th fibonnaci is 0 and 1st fibonnaci is 1.
*/

//code
import java.util.*;
public class Main {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/

		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int i=1,j=1;
        if(n==1 || n==2)
        {
        
        System.out.println(i);
            return;
        }else if(n==0)
        {
           System.out.println(0);   
            return;
        }
            
        int sum=i+j;
	    for(int k=1;k<=n-2;k++)
        {   int temp=(i+j);
            i=j;
            sum=temp;
            j=sum; 

            
            
        }
    
        System.out.println(sum);
    }

}
