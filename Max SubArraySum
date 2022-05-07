import java.util.*;
public class Solution {
    
    public static int maxSum(int arr[], int n , int k){
        
          if(n <k){
              return -1;
          }
        
        int res =0;
        for(int i=0; i<k; i++)
            res += arr[i];
        
        
        int currSum = res;
        for(int i=k; i<n; i++){
            
               // System.out.println( currSum  + " " +arr[i-k] + " " + arr[i] + " "+ arr[k] );
            currSum += arr[i] - arr[i-k];

            res = Math.max(res, currSum);
        }
        
        return res;
    }
    
    public static void main(String[] args) {
		
         Scanner sc = new Scanner(System.in);
        
         int n = sc.nextInt();
        int k = sc.nextInt();
        
        int arr[] = new int[n];
        
        
        for(int i =0; i<n; i++){
            
            arr[i] = sc.nextInt();
        }
        
           System.out.println(maxSum(arr,n,k));

    }
}
