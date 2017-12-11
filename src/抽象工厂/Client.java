package 抽象工厂;

public class Client {
	public static void main(String[] args) {
		AbstractFactory a = new ConcreteFactory1();
		a.createProductA().method();
		a.createProductB().method();
	}
}
