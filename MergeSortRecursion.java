public class solution {

	public static void mergeSort(int[] a){
		 int n = a.length;
        if(n <=1)
            return;
        
        int b[] = new int[n/2];
        int c[] = new int[n - b.length];
        
        for(int i=0; i<n/2; i++){
            b[i] = a[i];
        }
        
        for(int i= n/2; i<n; i++){
            c[i - n/2] = a[i];
        }
        
        mergeSort(b);
        mergeSort(c);
        merge(b ,c ,a);
		
	}
    
    public static void merge(int arr1[], int arr2[], int arr[]) {
    	
        int m = arr1.length;
        int n = arr2.length;
        
     
        
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
        
        
    }
}
