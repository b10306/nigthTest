package test;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		A a;
		A b;
//		a = new A();
//		b = new A();
		Class clz = A.class;
		System.out.println(clz.getName());
	}

}
