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
	
        
        quick(arr, 0, arr.length-1);
		
	}
	
}
