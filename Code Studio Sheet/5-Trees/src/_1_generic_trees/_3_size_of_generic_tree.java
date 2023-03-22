package _1_generic_trees;
import java.util.*;
public class _3_size_of_generic_tree {
//	static Node<Integer> take_input(Scanner sc){
//		System.out.println("Enter the node data");
//		int data=sc.nextInt();
//		Node<Integer> root=new Node<Integer>(data);
//		System.out.println("Enter child count for "+data+" th node");
//		int childCount=sc.nextInt();
//		for(int i=0;i<childCount;i++) {
//			Node<Integer> child=take_input(sc);
//			root.children.add(child);
//		}
//		return root;
//	}
	static Node<Integer> take_input(Scanner sc){
		Stack<Node<Integer>> stack=new Stack<>();
		Node<Integer> root=null;
		int arr[]= {10,20,50, -1, 60, -1, -1, 30, 70 ,-1 ,80 ,110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==-1) {
				stack.pop();
			}else {
				Node<Integer> newNode=new Node<>(arr[i]);
				if(!stack.isEmpty()) {
					stack.peek().children.add(newNode);
				}else {
					root=newNode;
				}
				stack.push(newNode);
			}
			
		}
		return root;
	}
	static int size(Node<Integer> root) {
		int sum=0;
		for(int i=0;i<root.children.size();i++) {
			int small=size(root.children.get(i));
			sum=sum+small;
		}
		sum+=1;
		return sum;
	}
	public static void main(String rags[]) {
		Scanner sc=new Scanner(System.in);
		Node<Integer> root=take_input(sc);
		System.out.println(size(root));
	}
}
