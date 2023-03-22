package _1_generic_trees;
import java.util.*;
class TreeNode<T>{
	T data;
	ArrayList<TreeNode<T>> children;
	TreeNode(T data){
		this.data=data;
		children=new ArrayList<>();
	}
}
class _2_print_tree_using_stack {
	static TreeNode<Integer> take_input(int arr[]){
		Stack<TreeNode<Integer>> stack=new Stack<>();
		TreeNode<Integer> root=null;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==-1) {
				stack.pop();
			}else{
				TreeNode<Integer> newNode=new TreeNode<>(arr[i]);
				
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
	static void print(TreeNode<Integer> root) {
		String str=root.data+"->";
		for(int i=0;i<root.children.size();i++) {
			str+=root.children.get(i).data+",";
		}
		System.out.println(str);
		for(int i=0;i<root.children.size();i++) {
			print(root.children.get(i));
		}
		
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		TreeNode<Integer> root=take_input(arr);
		print(root);
	}
}
//24
//10 20 50 -1 60 -1 -1 30 70 -1 80 110 -1 120 -1 -1 90 -1 -1 40 100 -1 -1 -1