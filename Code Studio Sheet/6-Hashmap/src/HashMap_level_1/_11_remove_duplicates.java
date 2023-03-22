package HashMap_level_1;
import java.util.*;
public class _11_remove_duplicates {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		HashMap<Integer,Boolean> map=new HashMap<>();
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				continue;
			}
			list.add(arr[i]);
			map.put(arr[i],true);
			}
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}
