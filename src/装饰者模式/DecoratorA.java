package 装饰者模式;

public class DecoratorA extends Decorator {

	public DecoratorA(Human human) {
		super(human); // 注意
	}

	@Override
	public void wearClothes() {
		super.wearClothes();
		System.out.println("Wear Clothes A!");

	}

}
