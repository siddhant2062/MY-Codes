package rough;
import java.util.Scanner;
public class r_6 {
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	
	int x=s.nextInt();
	int n=s.nextInt();
    int i=1;
    int multi=1;
    
    while(i<=n) {
    	multi=multi*x;
    	i=i+1;
    }
    System.out.println(multi);
	
}
	
}
