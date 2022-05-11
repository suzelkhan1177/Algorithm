
public class solution {

    public static boolean helper(String s, int st , int ed){
        
         if(st == ed)
         return true;
        
        if((s.charAt(st)) != (s.charAt(ed)))
            return false;
        
        
        if(st < ed)
        return helper(s, st+1, ed-1);
        
        
        return true;
    }
    
	public static boolean isStringPalindrome(String s) {
	
          int n = s.length();
        
        if(n==0)
        return true;
        
        
        return helper(s, 0, n-1);
         
	}
}
