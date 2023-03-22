package HashMap_level_1;
import java.util.*;
public class _1_intro_to_hashmap {
	public static void main(String args[]) {
		HashMap<String,Integer> hm=new HashMap<>();
		hm.put("India",35);
		hm.put("China", 10);
		hm.put("England",20);
		hm.put("Africa", 30);
		hm.put("America",40);
		System.out.println(hm);
		System.out.println(hm.get("India"));
		hm.put("India",40);
		System.out.println(hm.get("India"));
		System.out.println(hm.get("America"));
		
		System.out.println(hm.containsKey("India"));
		
		
//		now to get all the keys
		
		Set<String> keys=hm.keySet();
		System.out.println(keys);
		
//		now we will make a loop through hashmap
		
		for(String str:keys) {
			System.out.println(str);
		}
	}
}
