package linked_list_1;
//this node class will be used by every other classes in the package
class Node<T> {
	T data;
	Node<T> next;
	Node(T data){
		this.data=data;
		next=null;
	}
}
