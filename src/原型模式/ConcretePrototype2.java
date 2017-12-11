package 原型模式;

public class ConcretePrototype2 implements Prototype {
	public Prototype clone() {
		Prototype prototype = new ConcretePrototype2();
		System.out.println("In ConcretePrototype1 clone");
		return prototype;
	}
}