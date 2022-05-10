
public class solution {

	public static void towerOfHanoi(int n, char src, char hel, char des) {
	
        if(n==0)
           return;
        
          if(n ==1){
              System.out.println(src +" "+ des);
              return;
          }
        
           towerOfHanoi(n-1, src, des, hel);
          System.out.println(src +" "+ des);
         towerOfHanoi(n-1, hel, src, des);

	}
}
