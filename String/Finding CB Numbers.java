import java.util.*;
public class Main {

	public static boolean isCB(String str)
	{
		Long n = Long.parseLong(str);

		int[] arr = {2,3,5,7,11,13,17,19,23,29};

		if(n==0 || n==1)
			return false;

		for(int i=0;i<arr.length;i++)
		{
			if(n==arr[i])
			  return true;
     
			if(n%arr[i]==0)
			  return false;  
		}

		return true;	
	}

	public static boolean isVisited(boolean[] visited, int si, int ei)
	{
		for(int i=si; i<=ei; i++)
		{
			if(visited[i]==true)
				return true;
		}
		return false;
	}

    public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();

		int ctr = 0;

		if(n==1)
		{
			if(isCB(s))
			 ctr++;

			System.out.print(ctr); 
		}
		else
		{
		boolean[] visited = new boolean[n];

		for(int i=1;i<n;i++)
		{
			for(int start=0;start<=n-i;start++)
			{
				int end = start + i;

				String sub = s.substring(start,end);
                
				if(isCB(sub)==true && isVisited(visited,start,end-1)==false)
				{
					for(int j=start; j<=end-1;j++)
					{
						visited[j] = true;
					}

					ctr++;
				}
				
				
			}
		}

		System.out.print(ctr); }
		
    }
}
