import java.util.Scanner;
public class leap_year {
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	
	int year=s.nextInt();
	
	if((year%400==0)||(year%4==0&&year%100!=0)) {
		System.out.print("leap year");
	}else {
		System.out.print("not leap year");
	}


	
	
	
}
}
