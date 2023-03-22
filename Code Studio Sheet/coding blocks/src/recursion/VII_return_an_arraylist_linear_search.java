package recursion;
import java.util.*;
public class VII_return_an_arraylist_linear_search {
	static ArrayList<Integer> all_target_index(ArrayList<Integer> list,int target,int index,int arr[]){
		if(index==arr.length) {
			return list;
		}
		if(arr[index]==target) {
			list.add(index);
		}
			return all_target_index(list,target,++index,arr);
		
	}
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
//	ArrayList<Integer> list=new ArrayList<>();
	int size=s.nextInt();
	int arr[]=new int[size];
	for(int i=0;i<size;i++) {
		arr[i]=s.nextInt();
	}
	int target=s.nextInt();
	System.out.println(all_target_index(new ArrayList<>(),target,0,arr));
	
}
}
