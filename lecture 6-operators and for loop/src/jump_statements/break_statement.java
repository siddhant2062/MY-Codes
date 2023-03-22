package jump_statements;

public class break_statement {
	public static void main(String args[]) {
		
		int i = 1;
		while(i < 3) {
		    int j = 1;
		    while(j < 5) {
		        if(j == 3) {
		            break;
		        }
		        System.out.print(j + " ");
		        j++;
		    }
		    i++;
		}
	}

}
