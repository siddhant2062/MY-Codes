package generics;
import java.util.*;
class Pair<T>{
	private T first;
	private T second;
	
	public Pair(T first,T second) {
		this.first=first;
		this.second=second;
	}
	public void setFirst(T first) {
		this.first=first;
	}
	public T getFirst() {
		return first;
	}
	public void setSecond(T second) {
		this.second=second;
	}
	public T getSecond() {
		return second;
	}
}
class Multiple_pair<T,V>{
	private T first;
	private V second;
	
	public Multiple_pair(T first,V second) {
		this.first=first;
		this.second=second;
	}
	
	public void setFirst(T first) {
		this.first=first;
	}
	public T getFirst() {
		return first;
	}
	public void setSecond(V second) {
		this.second=second;
	}
	public V getSecond() {
		return second;
	}
}

public class Pair_use {
	public static void main(String args[]) {
//		for pair class
		Pair<Integer> p=new Pair<>(1,2);
		System.out.println(p.getFirst()+" "+p.getSecond());
		p.setFirst(100);
		p.setSecond(200);
		System.out.println(p.getFirst()+" "+p.getSecond());
		System.out.println("******************************************");
		
		Pair<String> p1=new Pair<>("a","b");
		p1.setFirst("siddhant");
		System.out.println(p1.getFirst()+" "+p1.getSecond());
		System.out.println("******************************************");

// 		for multiple pair class
		Multiple_pair<Integer,String> m=new Multiple_pair<>(2010990685,"siddhant");
		m.setSecond("sid");
		System.out.println(m.getFirst()+" "+m.getSecond());
		System.out.println("********************************************");		
		
		Multiple_pair<String,String> m1=new Multiple_pair<>("siddhant","srivastava");
		System.out.println(m1.getFirst()+" "+m1.getSecond());
		System.out.println("********************************************");
//	for internal pair inside multiple pair class
		Multiple_pair<Integer,String> internal=new Multiple_pair<>(685,"sid");
		Multiple_pair<Multiple_pair<Integer,String>,String> mp=new Multiple_pair<>(internal,"Srivastava");
		System.out.println(mp.getFirst().getFirst());
		System.out.println(mp.getFirst().getSecond());
		System.out.println(mp.getFirst());
		System.out.println(mp.getSecond());
		
	}
}
