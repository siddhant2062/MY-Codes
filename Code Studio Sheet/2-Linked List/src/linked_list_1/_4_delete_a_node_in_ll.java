package linked_list_1;
import java.util.*;
public class _4_delete_a_node_in_ll {
	static Node<Integer> take_input(){
		Scanner s=new Scanner(System.in);
		int data=s.nextInt();
		Node<Integer> head=null,tail=null;
		while(data!=-1) {
			Node<Integer> newNode=new Node<>(data);
			if(head==null) {
				head=newNode;
				tail=newNode;
			}else {
				tail.next=newNode;
				tail=tail.next;
			}
			data=s.nextInt();			
		}
		return head;
	}
	static Node<Integer> delete(Node<Integer> head,int pos){
		if(head==null) {
			return head;
		}
		if(pos==0) {
			head=head.next;
			return head;
		}
		int i=0;
		Node<Integer> temp=head;
		while(temp!=null&&i<pos-1) {
			temp=temp.next;
			i++;
		}
		if(temp==null||temp.next==null) {
			return head;
		}
		temp.next=temp.next.next;
		return head;
		
	}
	static void print(Node<Integer> head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		Node<Integer> head=take_input();
		int pos=s.nextInt();
		Node<Integer> temp=delete(head,pos);
		print(temp);
	}
}
