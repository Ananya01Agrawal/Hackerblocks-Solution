import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.print(str.charAt(0));
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)>='A'&& str.charAt(i)<='Z'){
                System.out.println();
            }
            System.out.print(str.charAt(i));
        }


    }
}
