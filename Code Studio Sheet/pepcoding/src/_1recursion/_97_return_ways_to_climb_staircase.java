package _1recursion;
import java.util.*;
public class _97_return_ways_to_climb_staircase {
	static ArrayList<String> getpaths(int n){
		if(n==0) {
			ArrayList<String> ans=new ArrayList<>();
			ans.add("");
			return ans;
		}else if(n<0) {
			ArrayList<String> ans=new ArrayList<>();
			return ans;
		}
		ArrayList<String> paths1=getpaths(n-1);
		ArrayList<String> paths2=getpaths(n-2);
		ArrayList<String> paths3=getpaths(n-3);
		ArrayList<String> paths=new ArrayList<>();
		
		for(int i=0;i<paths1.size();i++) {
			paths.add(1+paths1.get(i));
		}
		for(int i=0;i<paths2.size();i++) {
			paths.add(2+paths2.get(i));
		}
		for(int i=0;i<paths3.size();i++) {
			paths.add(3+paths3.get(i));
		}
		return paths;
	}
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	ArrayList<String> paths=getpaths(n);
	System.out.println(paths);
}
	
}
