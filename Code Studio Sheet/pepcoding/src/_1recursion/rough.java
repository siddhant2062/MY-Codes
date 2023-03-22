package _1recursion;
import java.util.*;
public class rough {
	static String[] permutationOfString(String input) {
		if(input.length() == 0){
            String y[] = {""};
            return y;
        }
        
        String [] ans = permutationOfString(input.substring(1));
      //  char ch = input.charAt(0);
		String output[] = new String[ans.length*input.length()];
        
        int k=0;
        for(int i=0;i<ans.length;i++){
            
            for(int j=0;j<=ans[i].length();j++){
                output[k++] = ans[i].substring(0,j) + input.charAt(0) + ans[i].substring(j);
            }
        }
        
        return output;
	}
	public static void main(String rags[]) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		System.out.println(Arrays.toString(permutationOfString(str)));
		String[] ans= {""};
		System.out.println(ans[0].length());
	}
}