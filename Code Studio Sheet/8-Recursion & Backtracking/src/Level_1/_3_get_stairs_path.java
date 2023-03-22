package Level_1;
//import java.nio.file.Paths;
import java.util.*;
public class _3_get_stairs_path {
	static ArrayList<String> count(int n){
		if(n==0) {
			ArrayList<String> ans=new ArrayList<>();
			ans.add("");
			return ans;
		}else if(n<0) {
			ArrayList<String> ans=new ArrayList<>();
			return ans;
		}
		ArrayList<String> paths1=count(n-1);
		ArrayList<String> paths2=count(n-2);
		ArrayList<String> paths3=count(n-3);
		ArrayList<String> ans=new ArrayList<>();
		for(int i=0;i<paths1.size();i++) {
			ans.add(1+paths1.get(i));
		}
		for(int i=0;i<paths2.size();i++) {
			ans.add(2+paths2.get(i));
		}
		for(int i=0;i<paths3.size();i++) {
			ans.add(3+paths3.get(i));
		}
		return ans;
		
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(count(n));
	}
}
