package 观察者模式;

public class Client {
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Subject s = new Subject();

		Observer o1 = new ConcreteObserver(s);
		Observer o2 = new ConcreteObserver(s);
		Observer o3 = new ConcreteObserver(s);

		// 某件事触发了Subject，需要notify
		s.notify("I am Changed!");

	}
}
