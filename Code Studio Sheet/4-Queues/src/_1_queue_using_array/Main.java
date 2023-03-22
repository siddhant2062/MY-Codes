package _1_queue_using_array;

public class Main {
	private int data[];
	private int front;
	private int rear;
	private int size;
	
	Main(){
		data=new int[3];
		front=-1;
		rear=-1;
		size=0;
	}
	int size() {
		return size;
		
	}
	boolean isEmpty() {
		return size()==0;
	}
	int front() throws EmptyQueueException {
		if(size()==0) {
			throw new EmptyQueueException();
		}
		return data[front];
	}
	void enqueue(int ele) throws QueueFullException {
		if(size==data.length) {
			throw new QueueFullException();
		}
		if(size==0) {
			front=0;
		}
		rear=(rear+1)%data.length;
		size++;
		data[rear]=ele;
	}
	int pop() throws EmptyQueueException {
		if(size==0) {
			throw new EmptyQueueException();
		}
		int temp=data[front];
		front=(front+1)%data.length;
		size--;
		if(size==0) {
			front=-1;
			rear=-1;
		}
		
		return temp;
	}
}
