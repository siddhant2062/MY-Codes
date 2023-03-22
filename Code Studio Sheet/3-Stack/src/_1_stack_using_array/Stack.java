package _1_stack_using_array;

class Stack {
	private int data[];
	private int top;
	
	Stack(){
		data=new int[10];
		top=-1;
	}
	Stack(int capacity){
		data=new int[capacity];
		top=-1;
	}
	
	boolean isEmpty() {
		return top==-1;
	}
	
	int size(){
		return top+1;
	}
	int top() throws StackEmptyException {
		if(size()==0) {
			//StackEmptyException
			StackEmptyException e=new StackEmptyException();
			throw e;
		}
		return data[top];
	}
	void push(int ele) throws StackFullException {
		if(size()==data.length) {
			//	StackFullException
//			StackFullException e=new StackFullException();
//			throw e;
			doubleCapacity();
		}
		top++;
		data[top]=ele;
	}
	private void doubleCapacity() {
		int temp[]=data;
		data=new int[2*temp.length];
		for(int i=0;i<=top;i++) { //for(int i=0;i<temp.length;i++) we can also write this
			data[i]=temp[i];
		}
		
	}
	int pop() throws StackEmptyException {
		if(size()==0) {
			//StackEmptyException
			StackEmptyException e=new StackEmptyException();
			throw e;
		}
		int temp=data[top];
		top--;
		return temp;
	}
	
}
