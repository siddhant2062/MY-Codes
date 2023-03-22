package linked_list_0;

//class Node1<T>{
//	T data;
//	Node<T> next;
//	
//	Node1(T data){
//		this.data=data;
//		
//	}
//}
//actually class node is created in _2_user_input_ll.java and we can't use same name class ....so below it is accessing _2_user_input_ll.java node class
public class _1_print_ll {
	static void print(Node<Integer> head){
		    Node<Integer> temp = head;

		    while(temp != null){
		        System.out.print(temp.data +" ");
		        temp = temp.next;
		    }
		    System.out.println();
		}

		public static void main(String args[]){

		    Node<Integer> node1 = new Node<Integer>(10);
		    Node<Integer> node2 = new Node<Integer>(20);
		    node2.next = node1;
		    print(node2);
		   }
		

}
