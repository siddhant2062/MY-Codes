package while_loop;
import java.util.Scanner;
public class farhenheit_to_celsius {
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	
	int S=s.nextInt(); //start farhenheit value
	int E=s.nextInt(); //end farhenheit value
	int W=s.nextInt(); // gap between start farhenheit value and upcoming start farhenheit value
	int cel;
	
	while(S<=E) {
	 cel=(int)(5.0/9*(S-32));
	 System.out.println(S+" "+cel);
	 S=S+W;
	}
	
}

}
