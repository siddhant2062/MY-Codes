package loops;
import  java.util.Scanner;
public class combination {	
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	
	int n=s.nextInt();
	
	int r=s.nextInt();
	int fact1=1;
	for(int i=1;i<=n;i++) {
		fact1=fact1*i;
	}	
	int fact2=1;
	for(int j=1;j<=r;j++) {
		fact2=fact2*j;
		
	}
	int fact3=1;
	for(int k=1;k<=n-r;k++) {
		fact3=fact3*k;		
	}
	int combi=fact1/(fact2*fact3);
	System.out.print(combi);

}
}
