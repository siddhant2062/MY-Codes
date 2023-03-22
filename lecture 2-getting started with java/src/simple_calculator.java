import java.util.Scanner;
public class simple_calculator {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String yn;
		do {
				
		System.out.println("enter any no");
		int a=s.nextInt();
		System.out.println("enter any no");
		int b=s.nextInt();
		int res;
		System.out.println("enter(+,-,*,/,%)");
		String symbol=s.next();
		
		switch(symbol) {
		
		case"+":res=a+b;
		System.out.println(res);
		break;
		
		case"-":res=a-b;
		System.out.println(res);		
		break;
		
		case"*":res=a*b;
		System.out.println(res);
		break;
		
		case"/":res=a/b;
		System.out.println(res);
		break;
		
		case"%":res=a%b;
		System.out.println(res);
		break;
		
		default:System.out.print("invalid symbol");
		break;
		}
		System.out.println("do you want to continue(type y for yes and n for no)");
	    yn=s.next();
		}
	while(yn.equals("y")); 
	}
		
}


	

		
		
	



