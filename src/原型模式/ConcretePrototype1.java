package 原型模式;

public class ConcretePrototype1 implements Prototype {
	public Prototype clone() {
		Prototype prototype = new ConcretePrototype1();
		System.out.println("In ConcretePrototype1 clone");
		return prototype;

	}
}
