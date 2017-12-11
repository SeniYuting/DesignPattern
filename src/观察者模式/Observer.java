package 观察者模式;

public abstract class Observer {
	
	Subject s;

	public Observer(Subject s) {
		this.s = s;
		s.register(this);
	}

	public abstract void update(String sth);

}
