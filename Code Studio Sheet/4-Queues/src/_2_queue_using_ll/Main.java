package _2_queue_using_ll;
import java.util.*;
class Stack{
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
	int size() {
		return top+1;
	}
	boolean isEmpty() {
		return size()==0;
	}
	int peek() throws QueueEmptyException {
		if(size()==0) {
			throw new QueueEmptyException();
		}
		return data[top];
	}
	void push(int ele) {
		if(size()==data.length) {
			doubleCapacity();
		}
		top++;
		data[top]=ele;
		
	}
	private void doubleCapacity() {
		int temp[]=data;
		data=new int[2*temp.length];
		for(int i=0;i<temp.length;i++) {
			data[i]=temp[i];
		}
	}
	int pop() {
		
	}
}
class Main{
	public static void main(String args[]) {
		
	}
	
}
