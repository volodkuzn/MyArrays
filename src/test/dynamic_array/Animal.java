package test.dynamic_array;

public class Animal implements Comparable<Animal> {

	public int weight;
	
	public String name;
	
	Animal(String n, int w) {
		weight = w;
		name = n;
	}
	
	@Override
	public String toString() {
		String s = name + " " + weight;
		return s;
	}
	
	@Override
	public int compareTo(Animal a) {
		if (a.weight > weight) {
			return 1;
		} else if (a.weight == weight) {
			return 0;
		} else {
			return -1;
		}
	}
	
}
