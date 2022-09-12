/*
Luke Skywalker gave Chewbacca an integer number x. Chewbacca isn't good at numbers but he loves inverting digits in them. Inverting digit t means replacing it with digit 9 - t.

Help Chewbacca to transform the initial number x to the minimum possible positive number by inverting some (possibly, zero) digits. The decimal representation of the final number shouldn't start with a zero.

Input Format
The first line contains a single integer x (1 ≤ x ≤ 10^18) — the number that Luke Skywalker gave to Chewbacca.

Constraints
x <= 100000000000000000

Output Format
Print the minimum possible positive number that Chewbacca can obtain after inverting some digits. The number shouldn't contain leading zeroes.

Sample Input
4545
Sample Output
4444
*/

//code
import java.util.*;
public class Main {
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        String ans = "";
        for(int i = 0 ; i < st.length() ; i++){
            char ch = st.charAt(i);
            if(i == 0 && ch == '9'){
                ans += ch;
                continue;
            }

            int t = ch - '0';
            if( 9-t > t)
            {
                ans += ch;
            }
            else{
                ch = (char) (((char) (9 - t)) + '0' );
                ans += ch;
            }
        }
        System.out.println(ans);
    }
}
