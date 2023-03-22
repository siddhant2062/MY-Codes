package _1_queue_using_array;
import java.util.*;
class TNode<T>{
	T data;
	ArrayList<TNode<T>> children;
	TNode(T data){
		this.data=data;
		children=new ArrayList<>();
	}
}
public class Main1 {
	static TNode<Integer> take_input(Scanner sc){
		System.out.println("Enter data for the next node");
		int data=sc.nextInt();
		TNode<Integer> root=new TNode<>(data);
		System.out.println("Enter child count of "+data);
		int child_count=sc.nextInt();
		for(int i=0;i<child_count;i++) {
			TNode<Integer> child=take_input(sc);
			root.children.add(child);
		}
		return root;
	}
		static TNode<Integer> take_input_level(){
			ArrayDeque<TNode<Integer>> queue=new ArrayDeque<TNode<Integer>>();
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter data of next node");
			int data=sc.nextInt();
//			queue.add(10);
		}
}
	static void print(TNode<Integer> root) {
		String str=root.data+":";
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
		TNode<Integer> root=take_input(sc);
		print(root);
	}

}
