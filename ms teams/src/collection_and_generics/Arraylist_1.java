package collection_and_generics;
import java.util.*;
public class Arraylist_1 {
	public static void main(String args[]) {
		ArrayList a=new ArrayList() ; 
		a.add("siddhant");
		a.add("adarsh");
		a.add(12);
		a.add(13);
		System.out.println(a);
		
		Iterator<String> i=a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}
}
