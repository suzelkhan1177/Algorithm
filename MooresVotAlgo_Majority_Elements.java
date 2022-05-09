package dsa;

import java.util.*;

public class practic {
	
	
	 public static int MooresVotingAlgorithm(int[] arr) {
	        
	        int index =0;
	        int count =1;
	        
	        for(int i=1; i<arr.length; i++){
	            
	            if(arr[index] == arr[i]){
	                
	                count++;
	            }else{
	                count--;
	            }
	            
	            if(count ==0){
	                index = i;
	                count =1;
	            }
	            
	        }
	        
	        return arr[index];
	    }
	
	// O(N*N)
	public static int Majority(int arr[]) {
		
		 int max =0;
		    int index = -1;
		    
		  int n = arr.length;
		  for(int i=0; i<n; i++) {
			  
			  int count =0;
			   for(int j =0; j<n; j++) {
				   
				   if(arr[i] == arr[j]) {
					   count++;
				   }
			   }
			   
			    if(count > max) {
			    	
			    	max  = count;
			    	index = i;
			    }
		  }
		  return arr[index];
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,1, 2,3,1 };
	
	    System.out.println(Majority(arr));
	    System.out.println(MooresVotingAlgorithm(arr));
	   
		 
	}

}
