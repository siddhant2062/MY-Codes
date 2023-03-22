package _1_generic_trees;
import java.util.*;
public class _4_maxi_in_generic_tree {
	static Node<Integer> take_input(){
		Stack<Node<Integer>> stack=new Stack<>();
		Node<Integer> root=null;
		int arr[]= {130,20,50, -1, 60, -1, -1, 30, 70 ,-1 ,80 ,110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==-1) {
				stack.pop();
			}else {
				Node<Integer> newNode=new Node<>(arr[i]);
				if(!stack.isEmpty()) {
					stack.peek().children.add(newNode);
				}else{
					root=newNode;
				}
				stack.push(newNode);
			}			
			
		}
		return root;
	}
	static void print(Node<Integer> root) {
		String str=root.data+"->";
		for(int i=0;i<root.children.size();i++) {
			str+=root.children.get(i).data+",";
		}
		System.out.println(str);
		for(int i=0;i<root.children.size();i++) {
			print(root.children.get(i));
		}
	}
	static int maxi(Node<Integer> root) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<root.children.size();i++) {
			int small=maxi(root.children.get(i));
			if(max<small) {
				max=small;
			}			
		}
		if(max<root.data) {
			max=root.data;
		}
		return max;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Node<Integer> root=take_input();
		print(root);
		System.out.println("the greatest node is "+maxi(root));
	}
}
