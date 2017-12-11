package 桥接模式;

public class Rectangle extends Shape {

	int width;
	int height;
	Drawing drawing;

	public Rectangle(Drawing drawing, int width, int height) {
		this.width = width;
		this.height = height;
		this.drawing = drawing;
	}

	@Override
	public void draw() {
		drawing.drawRectangle(width, height);
	}

}
