package 装饰者模式;

public class DecoratorB extends Decorator {

	public DecoratorB(Human human) {
		super(human); // 注意
	}

	@Override
	public void wearClothes() {
		super.wearClothes();
		System.out.println("Wear Clothes B!");

	}
}
