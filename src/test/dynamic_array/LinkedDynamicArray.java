package test.dynamic_array;

public class LinkedDynamicArray implements DynamicArray {
	
	Node head;
	
	int size;
	
	public LinkedDynamicArray() {
		size = 0;
		head = null;
	}

	
	public LinkedDynamicArray(Object[] arr) {
		size = arr.length;
		head = null;
		for (int i = arr.length - 1; i >= 0; i--)
			add(arr[i]);
	}
	
	@Override
	public int size() {
		return size;
	}
	
	@Override
	public boolean isEmpty() {
		if (size == 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean contains(Object o) {
		for (Node i = head; i != null; i = i.next) {
			if (i.item.equals(o)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Object[] toArray() {
		Object[] a = new Object[size];
		int k = size - 1;
		for (Node i = head; i != null; i = i.next) {
			a[k] = i.item;
			k--;
		}
		return a;
	}

	@Override
	public boolean add(Object o) {
		head = new Node(null, o, head);
		size++;
		return true;
	}

	@SuppressWarnings("finally")
	@Override
	public boolean remove(Object o) {
		try {
			if (head.item.equals(o)) {
				head = head.next;
				return true;
			}
			for (Node i = head; i != null; i = i.next) {
				if (i.next.item.equals(o)) {
					i.next = i.next.next;
					return true;
				}
			}
		} catch (NullPointerException e) {
		} finally {
			return false;
		}
	}

	@Override
	public Object remove(int index) {
		index = size - index;
		Node n = head;
		for (int i = 0; i < (size - index - 1); i++)
			n = n.next;
		Object t = n.next.item;
		n.next = n.next.next;
		return t;
	}

	@Override
	public void clear() {
		head = null;
		size = 0;
	}

	@Override
	public Object get(int index) {
		index = size - index;
		Node n = head;
		for (int i = 0; i < index; i++) {
			n = n.next;
		}
		return n.item;
	}

	@Override
	public Object set(int index, Object element) {
		index = size - index;
		Node n = head;
		for (int i = 0; i < index; i++) {
			n = head.next;
		}
		Object t = n.item;
		n.item = element;
		return t;
	}

	@Override
	public int indexOf(Object o) {
		Node n = head;
		for (int i = 0; i < size; i++) {
			if (n.item.equals(o))
				return i;
			n = n.next;
		}
		return -1;
	}

}
