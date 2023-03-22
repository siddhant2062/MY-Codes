package rough;
import java.util.*;
public class rough_2 {
	static int MAX=1000000; 
	static ArrayList<Integer> primes = new ArrayList<Integer>(); 
	static void nearest()
	{ 
	    int n = MAX; 
	    int nNew = (int)Math.sqrt(n); 
	    
	   
	    int[] arr = new int[n / 2 + 500]; 
	  

	    for (int i = 1; i <= (nNew - 1) / 2; i++) 
	   for (int j = (i * (i + 1)) << 1;  
	                j <= n / 2; j = j + 2 * i + 1) 
	            arr[j] = 1; 
	  
	   
	    primes.add(2); 
	    
	    for (int i = 1; i <= n / 2; i++) 
	        if (arr[i] == 0) 
	            primes.add(2 * i + 1); 
	} 

    static int binary(int left,int right,int n) 
    { 
 if (left <= right) 
 { 
     int mid = (left + right) / 2; 
    
     if (mid == 0 || mid == primes.size() - 1) 
         return primes.get(mid); 

    
     if (primes.get(mid) == n) 
         return primes.get(mid - 1);
     
   
     if (primes.get(mid) < n && primes.get(mid + 1) > n) 
         return primes.get(mid); 
     if (n < primes.get(mid)) 
         return binary(left, mid - 1, n); 
     else
         return binary(mid + 1, right, n); 
 } 
 return 0; 
}
    public static void main (String[] args)  
    { 
    	Scanner s=new Scanner(System.in);
        nearest(); 
        int n =s.nextInt() ; 
        System.out.println(binary(0, 
                            primes.size() - 1, n)); 
    } 
    } 

