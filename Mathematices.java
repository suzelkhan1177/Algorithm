public class Mathmatics{
	
    public static int TrailingZero(int n) {
    	
    	  int result =0;
    	  
    	  for(int i=5; i<=n; i=i*5) {
    		   result = result + n/i;
    	  }
    	  
    	  return result;
    }
    
    
    
    public static boolean[]  SieveOfEratosthenes(int n) {
    	
    	   
//        if (n<3){
//    	return 0;
//    }
     
     
     int count =0;
     
     boolean isPrime[] = new boolean[n];
 	    Arrays.fill(isPrime, true);
 	  
 	  isPrime[0] =false;
 	  isPrime[1] = false;
 	  
 	  for(int i=2; i <n; i++) {
 		  if(isPrime[i] == true){
               count++;
 		  for(int j = i+i; j <n; j += i) {
 			  
 			  isPrime[j] =false;
                  }
           }
 	  }
   
    
     
     return isPrime;
    }
    
//    Greatest Common Divisor (GCD).
    public static int GCDfun1(int a, int b) {
    	
    	   if(b==0)
    		 return a;
    	   
    	   return GCDfun1(b, a%b);
    }
    
    
    public static int GCDfun2(int a, int b) {
    	
 	  while(b != 0) {
 		  int rem = a%b;
 		    a=b;
 		    b=rem;
 	  }
 	   
 	   return a;
 }
    
 public static int ModuloArithmetic(int a, int b) {
	 
	 int res = 1;
	 
	 while(b >0) {
	 
	 if((b&1) != 0) {
		 res = res *a;
	 }
	 
	 a = a*a;
	 b = b>>1;
	 
	 }
	 
	 return res;
	 
 }
 
 public static long ModuloArithmetic(long a, long b, int n) {
	 
	 long res = 1;
	 
	 while(b >0) {
	 
	 if((b&1) != 0) {
		 res = ( res * a%n) %n;
	 }
	 
	 a = (a%n * a%n )%n;
	 b = b>>1;
	 
	 }
	 
	 return res;
	 
 }
	
	public static void main(String[] args) {
		
		
		  
		int n =20;
		
		boolean[] isPrime = SieveOfEratosthenes(n);
		
		  for(int i=0; i<n; i++) {
    		  
			  if(isPrime[i] == true)
				  System.out.print( i+ " ");
	    }
		  System.out.println();
		System.out.println("Trailing Zero " +TrailingZero(12));
		
		System.out.println("GCD = " + GCDfun1(42,24));
		System.out.println("Fast Power = "+ ModuloArithmetic(3, 5));
		System.out.println("Fast Power Long = "+ ModuloArithmetic(345464, 5, 10000007));
		 
	}

}
