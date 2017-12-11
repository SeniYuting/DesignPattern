package 只读;

public class Mutable implements ReadOnlyInterface {

	int a = 0;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

}
