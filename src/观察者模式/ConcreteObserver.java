package 观察者模式;

public class ConcreteObserver extends Observer {

	public ConcreteObserver(Subject s) {
		super(s);
	}

	@Override
	public void update(String sth) {
		System.out.println("收到的信息是:" + sth);
	}

}
