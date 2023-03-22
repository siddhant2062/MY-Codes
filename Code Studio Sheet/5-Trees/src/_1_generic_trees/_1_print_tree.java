package _1_generic_trees;
import java.util.*;
public class _1_print_tree {
	static Node<Integer> take_input(Scanner s){
		
		System.out.println("enter next node data");
		int data=s.nextInt();
		Node<Integer> root=new Node<>(data);
		System.out.println("Enter the count of childrens for "+data+"th node");
		int childCount=s.nextInt();
		for(int i=0;i<childCount;i++) {
			Node<Integer> child=take_input(s);
			root.children.add(child);
		}
		return root;
	}
	static void print(Node<Integer> root) {
		String str=root.data+": ";
		for(int i=0;i<root.children.size();i++) {
			str+=root.children.get(i).data+", ";
		}
		System.out.println(str);
		for(int i=0;i<root.children.size();i++) {
			print(root.children.get(i));
		}
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		Node<Integer> root=take_input(s);
		print(root);
//		Node<Integer> node1=new Node<Integer>(2);
//		Node<Integer> node2=new Node<Integer>(3);
//		Node<Integer> node3=new Node<Integer>(5);
//		Node<Integer> node4=new Node<Integer>(6);
//		root.children.add(node1);
//		root.children.add(node2);
//		root.children.add(node3);
//		root.children.add(node4);
//		System.out.println(root);
	}
}
