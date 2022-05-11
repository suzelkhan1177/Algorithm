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
	
public static boolean checkAB(String input) {
	
// Sample Input 1 :
// abb
// Sample Output 1 :
// true
        
        if(input.length() == 0){
            return true;
        }
        
      if(input.charAt(0) == 'a'){
          if(input.substring(1).length() > 1 && input.substring(1,3).equals("bb")){
              return checkAB(input.substring(3));
          }else{
               return checkAB(input.substring(1));
          }
      }
        return false;
	}

}
