import java.util.*;
public class solution {

	public static int maximumProfit(int arr[]) {
// Input: arr[] = {34, 78, 90, 15, 67}
// Output: 67
// Explanation: For the item with price 67, 
//  the number of buyers who can buy the item is 3.
//  Therefore, the profit earned is 67 * 3 = 201, which is maximum.

      int ans = Integer.MIN_VALUE;
        
        int profit =0;
        
        Arrays.sort(arr);
        
        int n = arr.length;
        
        for(int i=0; i<n; i++){
            
            int count = (n-i);
            
            if(ans < count *arr[i] ){
                
                profit = arr[i];
                ans = count * arr[i];
            }
        
        }
        
        return ans;
	}
  
  
// Given an integer N, find and return the count of minimum numbers, sum of whose squares is equal to N.
// That is, if N is 4, then we can represent it as : {1^2 + 1^2 + 1^2 + 1^2} and {2^2}. Output will be 1, as 1 is the minimum count of numbers required.  
  
  public static int minCount(int n){
    
//  Input:  n = 100
// Output: 1
// Explanation:
// 100 can be written as 102. Note that 100 can also be written as (5)2 + (5)2 + (5)2 + (5)2, but this representation requires 4 squares.
	
	     if(n ==0 || n ==1 || n==2 || n==3){
             return n;
         }
        int ans = Integer.MAX_VALUE;
        
        for(int i=1; i*i<=n; i++){
            
            ans = Math.min(ans, 1 + minCount(n-i*i));
            
        }
        return ans;
	}

}
