import java.util.Scanner;
public class armstrong_number {

	public static void main(String[] args) {
		int i,sum=0;
		Scanner s=new Scanner(System.in);
		
		
		i=s.nextInt();
		int orig=i;
		for(;i>0;i=i/10) {
			sum=sum+(i%10)*(i%10)*(i%10);
		}
		if(orig==sum) {
			System.out.println("no is armstrong");
			
		}else {
			System.out.println("no is not armstrong");
		}
		
		
		

	}

}
