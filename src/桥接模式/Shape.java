package 桥接模式;

public abstract class Shape {
	Drawing drawing;

	public Shape() {
	}

	public Shape(Drawing drawing) {
		this.drawing = drawing;
	}

	public abstract void draw();

}
