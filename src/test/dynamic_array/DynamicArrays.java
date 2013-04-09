package test.dynamic_array;

import java.util.Arrays;
import java.util.Scanner;

public class DynamicArrays {
	
	public static void sort(DynamicArray a) {
		Object[] b = a.toArray();
		Arrays.sort(b);
		a.clear();
		for (int i = 0; i < b.length; i++)
			a.add(b[i]);
	}
	
	public static void print(DynamicArray a) {
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
	}
	
	public static DynamicArray readFromConsole() {
		DynamicArray arr = new SimpleDynamicArray();
		Scanner in = new Scanner(System.in);
		String s = in.next();
		while (! s.contains("End")) {
			int w = in.nextInt();
			int a = in.nextInt();
			Human h = new Human(s, w, a);
			arr.add(h);
			s = in.next();
		}
		return arr;
	}

}
