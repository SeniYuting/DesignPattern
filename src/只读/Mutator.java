package 只读;

public class Mutator {
	public static void main(String[] args) {
		Mutable r = new Mutable();
		r.setA(3);
		System.out.println(r.getA());
	}
}
