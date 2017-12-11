package 中介者模式;

public class Client {
 
	public static void main(String[] args) {
		Mediator mediator = new ConcreteMediator();
		mediator.createMediator();
		mediator.work();
	}
	
}
