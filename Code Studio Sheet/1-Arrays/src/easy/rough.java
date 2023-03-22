package easy;
import java.util.*;
public class rough {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		ArrayList<Integer> arr=new ArrayList<>();
		System.out.println(arr.size());
		for(int i=0;i<5;i++) {
			arr.add(s.nextInt());
		}
		arr.add(2,50);//50 will be added to index 2 and all elements will be shifted by 1 
		arr.set(1, 100);//if we want to overwrite an element without increasing size of the arraylist
		System.out.println(arr.size());
		for(int i=0;i<arr.size();i++) {
			System.out.print(arr.get(i)+" ");
		}
		System.out.println();
		arr.remove(2);
		for(int i=0;i<arr.size();i++) {
			System.out.print(arr.get(i)+" ");
		}
	}

}
