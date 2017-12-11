package 装饰者模式;

public abstract class Decorator extends Human {

	private Human human;

	public Decorator(Human human) {
		this.human = human;
	}

	public void wearClothes() {
		human.wearClothes(); // 这里重点
	}

}
