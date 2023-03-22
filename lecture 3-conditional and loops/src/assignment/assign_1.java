package assignment;
import java.util.Scanner;
import java.lang.Math;
public class assign_1 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		 
		int basic=s.nextInt();
		String str=s.next();
//		int index=s.nextInt(); 
		char grade=str.charAt(0);
		
		double hra=(20.0/100)*basic;
	    double da=(50.0/100)*basic;
		double pf=(11.0/100)*basic;
				
		int allow;
		
		if(grade=='A')
		{
			 allow=1700;
		}
		else if(grade=='B')
		 {
			 allow=1500;
		 }
		 else
		 {
			 allow=1300;
		 }
			 
		 double total_salary=basic+hra+da+allow-pf;
    int round_off=(int)(Math.round(total_salary));      // double round_off=Math.round(total_salary);
//		 int a=(int)(round_off);
		 
		 System.out.println(round_off);
				 
		 
			 
		}
				
	}


