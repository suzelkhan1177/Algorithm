package dsa;

import java.util.*;

public class practic {
	
public static int kadanesAlgo(int a[]) {
	
	int max = Integer.MIN_VALUE;
	
	int currSum = 0;
	
	for(int i=0; i<a.length; i++) {
		
		currSum += a[i];
		
		if(max < currSum) {
			
			max = currSum;
		}
		
		   currSum = Math.max( currSum, 0);
		
	}
	return max;
}
	
	public static void main(String[] args) {
		
		int arr[] = {5, -4, -2, 6, -1};
		
		System.out.println(kadanesAlgo(arr));
		 
	}

}
