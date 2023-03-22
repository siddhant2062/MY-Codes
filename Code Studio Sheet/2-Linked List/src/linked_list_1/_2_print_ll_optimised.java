package linked_list_1;
import java.util.*;
public class _2_print_ll_optimised {
	
	static Node<Integer> take_input(){
		Scanner s=new Scanner(System.in);
		int data=s.nextInt();
		Node<Integer> head=null;
		Node<Integer> tail=null;
		while(data!=-1) {
			Node<Integer> newNode=new Node<>(data);
			if(head==null) {
				head=newNode;
				tail=newNode;
			}else{
				tail.next=newNode;
				tail=tail.next; //or we can write tail=newNode both are same in this case
			}
			data=s.nextInt();
		}
		return head;
		
	}
	static void print(Node<Integer> head) {
		Node<Integer> temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public static void main(String args[]) {
		Node<Integer> head=take_input();
		print(head);
		
		
	}
}
