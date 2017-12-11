package 装饰者模式;

public class Client {

	public static void main(String[] args) {
		Human person = new Person();
		Decorator decorator = new DecoratorB(new DecoratorA(person));
		decorator.wearClothes();
	}

}
