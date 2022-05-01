
public class Solution { 

//Merge Sort
public static int[] merge(int arr1[], int arr2[]) {
    	
        int m = arr1.length;
        int n = arr2.length;
        
        int arr[] = new int[m+n];
        
        int i =0;
        int j=0;
        int k=0;
        
        
        while(i<m && j<n){
            
                if(arr1[i] <= arr2[j]){
                    
                    arr[k] = arr1[i];
                    i++;
                    k++;
                }else{
                    
                    arr[k] = arr2[j];
                    j++;
                    k++;
                }
        }
        
        while(i<m){
              arr[k] = arr1[i];
                    i++;
                    k++;
        }
        
         while(j<n){
              arr[k] = arr2[j];
                    j++;
                    k++;
        }
        
        return arr;
    }


//  Insersion Sort
 public static void insertionSort(int[] arr) {
    	//Your code goes here
        
        for(int i=1; i<arr.length; i++){
            
            int j = i-1;
            int temp = arr[i];
            
            while(j >= 0 && arr[j] > temp ){
                
                arr[j+1] = arr[j];
                j--;
                
            }
            
            arr[j+1] = temp;
            
        }
    }

//Bubble Sort
 public static void bubbleSort(int[] a){
    	//Your code goes here
     int n = a.length;
		
		for(int i =0; i<n-1; i++) {
			
			for(int j=0; j<n-1; j++) {
				
				if(a[j] > a[j+1]) {
					
					int temp =a[j];
					    
					a[j] = a[j+1];
					a[j +1] = temp;
				}
			}
		}
    }  


// Selection  sort 
 public static void selectionSort(int[] arr) {

        
            int n = arr.length;
         for(int i=0; i<n-1; i++){
             
             int min = Integer.MAX_VALUE;
             int minIndex = -1;
             for(int j = i; j<n; j++){
                 
                 if(arr[j] < min){
                     
                     min = arr[j];
                     minIndex = j;
                 }
             }
             
             //Swap min value
             
             int temp = arr[i];
             arr[i] = arr[minIndex];
             arr[minIndex] = temp;
           
         }
    }   


    public static int binarySearch(int[] arr, int x) {
    	//Your code goes here
        
        
        // Binary Search
        
        int n = arr.length; 
        int s=0, e = n-1;
        int mid = s + (e-s)/2;
        
        while(s<=e){
            
            if(arr[mid] == x){
                return mid;
            }
            
            if(arr[mid] < x){
                
                s = mid +1;
            }else if(arr[mid] > x){
                
                e = mid -1;
            }
            
            
            mid = s + (e-s)/2;
        }
        
        
        return -1;
    }

}
