package test.dynamic_array;


public class SimpleDynamicArray implements DynamicArray {
	
	private Object[] a = null;
	
	private int size = 0;
	
	public SimpleDynamicArray() {
		a = new Object[0];
		size = 0;
	}
	
	public SimpleDynamicArray(Object[] arr) {
		a = arr.clone();
		size = arr.length;
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
		for (int i = 0; i < size; i++) {
			if (a[i].equals(o))
				return true;
		}
		return false;
	}

	@Override
	public Object[] toArray() {
		return a.clone();
	}

	@Override
	public boolean add(Object o) {
		Object[] b = a;
		a = new Object[size + 1];
		System.arraycopy(b, 0, a, 0, size);
		size++;
		a[size - 1] = o;
		return true;
	}

	@Override
	public boolean remove(Object o) {
		for (int i = 0; i < size; i++) {
			if (a[i].equals(o)) {
				this.remove(i);
				return true;
			}
		}
		return false;
	}

	@Override
	public Object remove(int index) {
		Object[] b = a;
		a = new Object[size - 1];
		System.arraycopy(a, 0, b, 0, index);
		System.arraycopy(a, index, b, (index + 1), (size - index - 1));
		size--;
		return b[index];
	}

	@Override
	public void clear() {
		a = new Object[0];
		size = 0;
	}

	@Override
	public Object get(int index) {
		return a[index];
	}

	@Override
	public Object set(int index, Object element) {
		Object t = a[index];
		a[index] = element;
		return t;
	}

	@Override
	public int indexOf(Object o) {
		for (int i = 0; i < size; i++)  {
			if (a[i].equals(o))
				return i;
		}
		return -1;
	}

}
