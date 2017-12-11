package 原型模式;

public class Client {

	public static void main(String[] args) {
		Prototype p = new ConcretePrototype1();
		@SuppressWarnings("unused")
		Prototype pp = (Prototype) p.clone();
	}
	
}
