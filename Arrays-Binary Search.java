import java.util.*;
public class Main {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
//array declaration
int [] arr = new int[N];
for(int i = 0; i<=arr.length-1; i++)
{
    arr[i] = sc.nextInt();
    }
    int M = sc.nextInt();
    int output = Binary(arr, M);
    System.out.println(output);
    }
    public static int Binary(int [] arr, int M)
    {
        int low = 0;// initializing low as zero
        int high = arr.length-1;// initializing high as last elemnt
        while(low<=high)//checking whether low is less than high or not
        {
            int mid = (low + high)/2;// finding the middle element
            if(M>arr[mid])
            {
                low = mid + 1;// if value to search is greater than mid than increasing the low with plus one
                }
                else if(M<arr[mid])// if value to search is less than mid
                {
                    high = mid-1;
                    }
                    else{
                        return mid;// else return the mid
                        }
                        }
                        return -1;
                        }

}
