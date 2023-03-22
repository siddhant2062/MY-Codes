package operators;
import java.util.Scanner;
class rough {
    public static void main(String args[]) {
    Scanner s=new Scanner(System.in);
	int length=0;
	
	int n=s.nextInt();
	int i=n;
	while(i>0) {
		
		length++;
		i=i/10;			
	}
	int sum=0;
	int rem=0;
	int j=n;
	while(j>0) {
		rem=j%10;
		
	
	int k=1;
	int pow=1;
	while(k<=length) {
		pow=pow*rem;
		k=k+1;
	}
	sum=sum+pow;
	j=j/10;
	}
if(n==sum) {
	System.out.print("true");
}else {
	System.out.print("false");
}
   } 
}
    



   

