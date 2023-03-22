package _1_generic_trees;
import java.util.*;
public class _5_height_of_a_generic_tree {
	static Node<Integer> take_input(){
		Stack<Node<Integer>> stack=new Stack<>();
		int arr[]= {130,20,50, -1, 60, -1, -1, 30, 70 ,-1 ,80 ,110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
		Node<Integer> root=null;
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
	static int height(Node<Integer> root) {
		int height=0;
		for(int i=0;i<root.children.size();i++) {
			int small=height(root.children.get(i));
			height=Math.max(height,small);
		}
		height+=1;
		return height;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Node<Integer> root=take_input();
		System.out.println("height of generic tree "+height(root));
	}
}
