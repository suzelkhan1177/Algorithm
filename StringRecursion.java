public class Solution {

	public static String removeConsecutiveDuplicates(String s) {
	
// Sample Input 1 :
// aabccba
// Sample Output 1 :
// abcba
        
        if(s.length()<=1){
            return s;
        }
        
        if(s.charAt(0) == s.charAt(1)){
            
            return removeConsecutiveDuplicates(s.substring(1));
            
        }else{
            
              return s.charAt(0) + removeConsecutiveDuplicates(s.substring(1));
        }

	}
  
  
  public static String removeX(String s){
		
// Sample Input 1 :
// xaxb
// Sample Output 1:
// ab
    
            if(s.length() == 0){
                return s;
            }
      
         String rem = removeX(s.substring(1));
        
        if(s.charAt(0)== 'x'){
            return "" + rem;
        }else{
            return s.charAt(0) + rem;
        }

	}

}
