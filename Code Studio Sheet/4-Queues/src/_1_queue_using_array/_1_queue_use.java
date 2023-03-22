package _1_queue_using_array;
import java.util.*;
public class _1_queue_use {
	public static void main(String args[]) throws QueueFullException,EmptyQueueException {
		Queue qe=new Queue();//here default size we have taken 3
		qe.enqueue(10);
		qe.enqueue(30);
		qe.enqueue(20);
		qe.dequeue();
		qe.dequeue();
		qe.enqueue(45);
		qe.enqueue(50);
		qe.enqueue(60);
//		qe.dequeue();
//		qe.dequeue();
//		qe.enqueue(200);
//		qe.enqueue(300);
		while(!qe.isEmpty()) {
			System.out.println(qe.dequeue());
		}
	}
}
