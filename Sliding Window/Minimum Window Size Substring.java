import java.util.*;
public class Main {
    static String SubString(String stra, String pata)
    {
        int len1 = stra.length();
        int len2 = pata.length();
        // finding for removal
        if (len1 < len2) {
            return "";
        }

        
 
        int hash_pat[] = new int[256];
        int hash_str[] = new int[256];
        // check for status
 
        
        for (int i = 0; i < len2; i++)
            hash_pat[pata.charAt(i)]++;
 // check for g
        int start = 0, start_index = -1,
            min_len = Integer.MAX_VALUE;

        int count = 0;
        for (int j = 0; j < len1; j++) {// check for llopo

            hash_str[stra.charAt(j)]++;
 
            if (hash_str[stra.charAt(j)]
                <= hash_pat[stra.charAt(j)])
                count++;

            if (count == len2) {







// find a and hashmap value
                while (hash_str[stra.charAt(start)]
                           > hash_pat[stra.charAt(start)]
                       || hash_pat[stra.charAt(start)]
                              == 0) {
 
                    if (hash_str[stra.charAt(start)]
                        > hash_pat[stra.charAt(start)])
                        hash_str[stra.charAt(start)]--;
                    start++;
                }

                int len_window = j - start + 1;
                if (min_len > len_window) {
                    min_len = len_window;
                    start_index = start;
                }
            }
        }
        // calculate simulatenously and ab
 
        if (start_index == -1) {
            return "";
        }

        return stra.substring(start_index, start_index + min_len);
        // read a and v
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String stra = sc.next();
        String pata = sc.next();
        // findog a 
 
        System.out.print(SubString(stra, pata));
    }}
