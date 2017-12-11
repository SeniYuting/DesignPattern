package 桥接模式;

public class Triangle extends Shape {

	int rows;
	Drawing drawing;

	public Triangle(Drawing drawing, int rows) {
		this.rows = rows;
		this.drawing = drawing;
	}

	@Override
	public void draw() {
		drawing.drawTriangle(rows);
	}

}