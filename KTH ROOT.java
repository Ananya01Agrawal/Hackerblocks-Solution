import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
	    	Scanner scn=new Scanner(System.in);// taking the input from the uiser
		   	int t=scn.nextInt();
		   	for (int i=1;i<=t;i++) {// traversing thropugh the number
                   long n=scn.nextLong();

                   long k=scn.nextLong();

                   double y = Math.pow(n, (1.0 / k));// applying the condition

                   long x =(long)(y);

                   if (Math.pow(x+1,k )==n)// checkiing the condition
                   
                   System.out.println(x+1);// printing the number
                   
                   else

                   System.out.println(x);  

		   	}
		
		

	}}
