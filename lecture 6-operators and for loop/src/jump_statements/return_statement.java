package jump_statements;

public class return_statement {
	public static void main(String args[]) {
		int i = 1;
		while(i < 3) {
		    int j = 0;
		    while(j < 5) {
		        j++;
		        if(j == 3) {
		            return;
		        }
		        System.out.print(j + " ");
		    }
		    i++;
		}
	}

}
