package recursion_1;
import java.util.*;
public class V_print_all_subset_in_iteration {
	static List<List<Integer>> subset(int[] arr){
		List<List<Integer>> outer =new ArrayList();
		outer.add(new ArrayList());
		for(int i=0;i<arr.length;i++) {
			int n=outer.size();
			for(int j=0;j<n;j++) {
				List<Integer> internal=new ArrayList<>(outer.get(j));//copy of outer list
				internal.add(arr[i]);
				outer.add(internal);
			}
		}
		return outer;
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int arr[]=new int[size];		
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}		
		List<List<Integer>> ans=subset(arr);
		System.out.println(ans);
	}
}
