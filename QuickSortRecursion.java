/*
	To apply the method explained in the hint video, we have to add two more parameters in the function call. This can be done by calling a helper function from given function. The helper function can have three parameters: array, start index, end index.  
	
	Skeleton code to achieve this:
	public class Solution {
		public static void quickSort(int[] input, int startIndex, int endInedx) {
			// your code goes here
		}
	
		public static void quickSort(int[] input) {
			quickSort(input, 0, input.length - 1);
		}
	
	}
	
*/


public class Solution {
    
    public static void quick(int arr[], int low , int high){
        
          if(low < high){
              
              int pi = partition(arr, low, high);
              
              quick(arr, low, pi-1);
              quick(arr, pi + 1, high);
          }
    }
    
    public static int partition(int arr[], int low, int high){
        
        //pivot initiliz n-1 element index
        int pivot = arr[high];
        
        // i initiliz -1
        int i = low - 1;
        
        for(int j=low; j<high; j++){
            
            if(arr[j] < pivot){
                i++;
                
                //Swap the element
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                
            }
        }
        
        i++;
        //Swap tha pivot element
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        
        return i;
    }
	
	public static void quickSort(int[] arr) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * No need to print or return the output.
		 * Taking input and printing output is handled automatically.
		 */
        
        quick(arr, 0, arr.length-1);
		
	}
	
}
