package _2_stack_using_ll;

class Stack_LL<T> {
	private int size;
	private Node<T> head;
	Stack_LL(){
		size=0;
		head=null;
	}
	
	int size() {
		return size;
	}
	boolean isEmpty() {
//		return head==null;
		return size()==0;
	}
	T top() throws StackEmptyException {
		if(size()==0) {
			StackEmptyException e=new StackEmptyException();
			throw e;
		}
		return head.data;
	}
	void push(T ele) {
		Node<T> newNode=new Node<>(ele);
		newNode.next=head;
		head=newNode;
		size++;
	}
	T pop() throws StackEmptyException {
		if(size()==0) {
			throw new StackEmptyException();
		}
		T temp=head.data;
		head=head.next;
		size--;
		return temp;
	}
	
}
