package _1_generic_trees;
import java.util.*;
public class _6_traversals_in_generic_tree {
	static Node<Integer> take_input(){
		Stack<Node<Integer>> stack=new Stack<>();
		int arr[]= {130,20,50, -1, 60, -1, -1, 30, 70 ,-1 ,80 ,110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
		Node<Integer> root=null;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==-1) {
				stack.pop();
			}else{
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
	static Node<Integer> takeinput(Scanner sc){
		System.out.println("Enter node data");
		int data=sc.nextInt();
		Node<Integer> root=new Node<>(data);
		System.out.println("Enter child count for "+data+"th node");
		int child_count=sc.nextInt();
		for(int i=0;i<child_count;i++) {
			Node<Integer> child=takeinput(sc);
			root.children.add(child);
		}
		return root;
	}
	static void print(Node<Integer> root) {
		String str=root.data+":";
		for(int i=0;i<root.children.size();i++) {
			str+=root.children.get(i).data+"->";
		}
		System.out.println(str);
		for(int i=0;i<root.children.size();i++) {
			print(root.children.get(i));
		}
		
	}
	static int size(Node<Integer> root) {
		int sum=0;
		for(int i=0;i<root.children.size();i++) {
			int small=size(root.children.get(i));
			sum+=small;
		}
		sum+=1;
		return sum;
	}
	static int maxi(Node<Integer> root) {
		int maxi=Integer.MIN_VALUE;
		for(int i=0;i<root.children.size();i++) {
			int small=maxi(root.children.get(i));
			if(maxi<small) {
				maxi=small;
			}
		}
		if(maxi<root.data) {
			maxi=root.data;
		}
		return maxi;
	}
	static int height(Node<Integer> root) {
		int height=0;
		for(int i=0;i<root.children.size();i++) {
			int small=height(root.children.get(i));
			if(height<small) {
				height=small;
			}
		}
		height+=1;
		return height;
				
				
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Node<Integer> root=take_input();
//		Node<Integer> root1=takeinput(sc);
		print(root);
		System.out.println("----------------------");
		System.out.println(size(root));
		System.out.println(maxi(root));
		System.out.println(height(root));
//		print(root1);
	}
}
