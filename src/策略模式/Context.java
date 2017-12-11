package 策略模式;

public class Context {
	Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public void ContextInteface() {
		strategy.AlgorithmInterface();
	}

}
