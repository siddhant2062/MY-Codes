package loops;
import java.util.Scanner;
public class function_fahrenheit_to_celsius {
		public static void printFahrenheitTable(int start, int end, int step) {
		
	        while(start<=end){
	            int cel=5*(start-32)/9;
	            System.out.println(start+" "+cel);
	            start=start+step;
			
		}
	}

		public static void main(String args[]) {
			Scanner s=new Scanner(System.in);
			int start=s.nextInt();
			int end=s.nextInt();
			int step=s.nextInt();
			
			printFahrenheitTable(start,end,step);
					
					
		}
}