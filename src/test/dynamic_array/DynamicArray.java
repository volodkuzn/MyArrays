package test.dynamic_array;

public interface DynamicArray {
	
	int size();
	
	boolean isEmpty();
	
	boolean contains(Object o);
	
	Object[] toArray();
	
	boolean add(Object o);
	
	boolean remove(Object o);
	
	Object remove(int index);
	
	void clear();
	
	Object get(int index);
	
	Object set(int index, Object element);
	
	int indexOf(Object o);

}