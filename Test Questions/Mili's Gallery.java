import java.util.*;
public class Main {
    public static void main (String args[]) {
        
        
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();

        int[] answer=new int[n];//taking the array as the input

        for(int i=0;i<n;i++){//traversing the array
            answer[i]=s.nextInt();
        }


        int k=s.nextInt();

        int i=1;

        int c=0;

        if(n>=3){

        while(i<n-1){
            if(answer[i]==0 && answer[i+1]==0 && answer[i-1]==0){
            c++;
            answer[i]=1;
            
            }
            i++;
        }


        if(answer[0]==0 && answer[1]!=1){ 
            c++; 
            answer[0]=1;
        }

        if(answer[n-1]==0 && answer[n-2]==0){
            c++;answer[n-1]=1;
        }
        }

        else if(n==2){
            if(answer[0]==0 && answer[1]==0) c++;
        }

        else{
            if(answer[0]==0) c++;
        }

        if(c>=k)

            System.out.println(true);

        
        else{
            System.out.println(false);
        }
    }
        
           
        
}
