import java.util.*;
public class Main {
    public static void main (String args[]) {
   Scanner sc=new Scanner(System.in);
   int num=sc.nextInt();
   int arr[]=new int[num];
   for(int i=0;i<num;i++)
   {
       arr[i]=sc.nextInt();
   }
   int ans=Sorted_Array(arr,num);
   System.out.println(ans);
    }
    public static int Sorted_Array(int arr[],int num)
    {
        int s=0;
        int e=num-1;
        int i,max,min;
        for(s=0;s<num-1;s++)
        {
            if(arr[s]>arr[s+1])
            break;
        }
        if(s==num-1)
        {
            return 0;
        }
        for(e=num-1;e>=0;e--)
        {
            if(arr[e]<arr[e-1])
            break;
        }
        max=arr[s];
        min=arr[s];
        for(i=s+1;i<=e;i++)
        {
            if(arr[i]>max)
            max=arr[i];
            if(arr[i]<min)
            min=arr[i];
        }
        for(i=0;i<s;i++)
        {
            if(arr[i]>min)
            {
                s=i;
                break;
            }
        }
        for(i=num-1;i>=e+1;i--)
        {
            if(arr[i]<max)
            {
                e=i;
                break;
            }
        }
        int res=e-s+1;
        return res;
        
    }
}
