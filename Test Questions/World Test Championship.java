import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int capacity = sc.nextInt();
        int[] temp = new int[capacity];
        for(int i = 0; i < capacity; ++i){
            temp[i] = sc.nextInt();
        }
        int result = L_Subarray(temp, capacity);
        System.out.println(result);
    }
    public static int L_Subarray(int a[], int capacity)
{
    HashMap<Integer,
            Integer> index = new HashMap<Integer,
                                         Integer>();
    int ans = 0;
    for(int i = 0, j = 0; i < capacity; i++)
    {
        j = Math.max(index.containsKey(a[i]) ? index.get(a[i]) : 0, j);
        ans = Math.max(ans, i - j + 1);
        index.put(a[i], i + 1);
    }
    return ans;
}
}
