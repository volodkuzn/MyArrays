package test.dynamic_array;

public class Human extends Animal {
	
	public int age;
	
	Human(String n, int w, int a) {
		super(n, w);
		age = a;
	}
	
	public int compareTo(Human o) {
		if (o.age > age) {
			return 1;
		} else if (o.age == age) {
			return 0;
		} else {
			return -1;
		}
	}
	
	@Override
	public String toString() {
		return (super.toString() + " " + age);
	}
}
