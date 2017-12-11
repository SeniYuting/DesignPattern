package 桥接模式;

public class Client {

	public static void main(String[] args) {
		Shape shape1 = new Rectangle(new V1Drawing(), 3, 4);
		shape1.draw();

		Shape shape2 = new Triangle(new V2Drawing(), 5);
		shape2.draw();

	}

}
