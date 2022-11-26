import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);//taking the input from the user

        int k = sc.nextInt();//taking the integer input

        String st = sc.next();// taking the string as the input

        int a = max_length_substring(st , 'b' , k);


        int b = max_length_substring(st ,  'a' , k);



        System.out.println(Math.max(a , b));

    }




    static int max_length_substring(String st , char ch , int k){
        int s = 0;// initializing the s as zero

        int e = 0;// initializing the  e  as zero

        int flip = 0;// initialising the flip as zero

        int ans = 0;// initializing the answer as zero

        while (e < st.length()){




//            GROWING STEP
            if(st.charAt(e) == ch){
                flip++;
            }




//            SHRINKING STEP
            while (flip > k){
                if(st.charAt(s) == ch){
                    flip--;
                }
                s++;
            }





//            WINDOW SIZE
            ans = Math.max(ans , e - s + 1);
            e++;
        }
        return ans;
    }
}
