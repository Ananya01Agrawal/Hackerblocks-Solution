import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int count=0;
        int max=0;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                count++;
            }
            else{
                max=Math.max(max,count);
                count=0;
            }
        }
        System.out.println(Math.max(max,count));
    }
}
