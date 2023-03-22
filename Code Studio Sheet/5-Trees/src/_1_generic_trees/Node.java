package _1_generic_trees;
import java.util.*;
class Node<T> {
	T data;
	ArrayList<Node<T>> children;
	Node(T data){
		this.data=data;
		children=new ArrayList<>(); 
	}
		
}

