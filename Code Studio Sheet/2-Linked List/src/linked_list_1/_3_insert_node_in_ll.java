package linked_list_1;
import java.util.*;
public class _3_insert_node_in_ll<T> {
	 static Node<Integer> take_input() {
		 Scanner s=new Scanner(System.in);
		 Node<Integer> head = null,tail=null;
		int data=s.nextInt();
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
	 static Node<Integer> insert(int data,Node<Integer> head,int pos){
		 int i=0;
		 Node<Integer> newNode=new Node<>(data);
		 if(pos==0) {
			 newNode.next=head;
//			 head=newNode;
//			 return head;     //this is also correct
			 return newNode;
		 }
		 Node<Integer> temp=head;
		 while(i<pos-1) {
			 temp=temp.next;
			 i++;
		 }
//		 note:- in LL make links before we break
		newNode.next=temp.next;//before inserting any element storing the next node address in the newNode
		 temp.next=newNode;
		 return head;
		
		  
		 
	 }
	 static void print(Node<Integer> head) {
		 while(head!=null) {
			 System.out.print(head.data+" ");
			 head=head.next;
		 }
	 }
	public static void main(String rags[]) {
		Scanner s=new Scanner(System.in);
		Node<Integer> head=take_input();
		int data=s.nextInt();
		int pos=s.nextInt();
		Node<Integer> temp=insert(data,head,pos);
		print(temp);
	}
}
