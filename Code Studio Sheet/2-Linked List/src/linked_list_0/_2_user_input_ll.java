package linked_list_0;
import java.util.*;
class Node<T>{
	T data;
	Node<T> next;
	Node(T data){
		this.data=data;
		next=null;
	}
	
}
public class _2_user_input_ll {
	static Node<Integer> take_input(){
		Scanner s=new Scanner(System.in);
		Node<Integer> head=null;
		int data=s.nextInt();
		
		while(data!=-1) {
			Node<Integer> newNode=new Node<>(data);
			if(head==null) {
				head=newNode;				
			}else {
				Node<Integer> temp=head;
				while(temp.next!=null) {
					temp=temp.next;
				}
				temp.next=newNode;
			}
			data=s.nextInt();
		}
		return head;
		
		
	}
	static void print(Node<Integer> head) {
		Node<Integer> temp=head;
		while(temp!=null) {
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
	}
	public static void main(String args[]) {
		Node<Integer> head=take_input();
		print(head);
	}
}
