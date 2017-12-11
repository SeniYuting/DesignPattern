package 策略模式;

public class Client {
	public static void main(String[] args) {

		Context context;

		context = new Context(new ConcreteStrategyA());
		context.ContextInteface();

		context = new Context(new ConcreteStrategyB());
		context.ContextInteface();

		context = new Context(new ConcreteStrategyC());
		context.ContextInteface();

	}
}
