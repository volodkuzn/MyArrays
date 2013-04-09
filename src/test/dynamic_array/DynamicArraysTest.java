package test.dynamic_array;

public class DynamicArraysTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DynamicArray a = DynamicArrays.readFromConsole();
		DynamicArrays.sort(a);
		DynamicArrays.print(a);
	}

}
