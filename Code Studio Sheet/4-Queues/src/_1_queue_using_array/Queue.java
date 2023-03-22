 package _1_queue_using_array;

class Queue {
	private int data[];
	private int front;
	private int rear;
	private int size;
	Queue(){
		data=new int[3];
		front=-1;
		rear=-1;
		size=0;
	}
	Queue(int capacity){
		data=new int[capacity];
		front=-1;
		rear=-1;
		size=0;
	}
	int size() {
		return size;
	}
	boolean isEmpty() {
		return size==0;
	}
	int front() throws EmptyQueueException {
		if(size==0) {
			throw new EmptyQueueException();
		}
		return data[front];
	}
	void enqueue(int ele) {
		if(size==data.length) {
			doubleCapacity();
		}
		if(size==0) {
			front=0;
		}
		rear=(rear+1)%data.length;
		/*rear++;
		if(rear==data.length) {
			rear=0;
		}*/
		size++;
		data[rear]=ele;
	}
	private void doubleCapacity() {
		int temp[]=data;
		data=new int[2*temp.length];
		int idx=0;
		for(int i=front;i<temp.length;i++) {
			data[idx++]=temp[i];
		}
		for(int i=0;i<front;i++) {
			data[idx++]=temp[i];
		}
		front=0;
		rear=temp.length-1;
	}
	int dequeue() throws EmptyQueueException{
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
