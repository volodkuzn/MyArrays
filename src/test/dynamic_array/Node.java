package test.dynamic_array;

class Node {
	
	public Object item;
	
	public Node next;
	
//	public Node prev;
	
	public Node(Node prev, Object element, Node next) {
		this.item = element;
		this.next = next;
		//this.prev = prev;
	}
	
	public Node() {
		this.item = null;
		this.next = null;
//		this.prev = null;
	}	
}
