import java.util.*;
public class solution {

	public static int convertStringToInt(String s){
		// Write your code here
       int n = s.length();
       if(n == 1){
           return (s.charAt(0) - 48);
       }
        
       
    double a = convertStringToInt(s.substring(1));
        
    double b = s.charAt(0) - 48;
        
        b = b * Math.pow(10, n-1) + a;
        
        return (int)b;
	}
}
