package 只读;

public class UnprivilegedClass {
	public static void main(String[] args) {
		ReadOnlyInterface r = new Mutable();
		System.out.println(r.getA());
	}
}
