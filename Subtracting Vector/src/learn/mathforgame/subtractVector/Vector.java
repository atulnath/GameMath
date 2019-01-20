package learn.mathforgame.subtractVector;

public class Vector {
	private int x, y;

	public Vector() {
	}

	public Vector(int x, int y) {

		this.x = x;
		this.y = y;
	}
	
	public Vector subtractPoint(Point p, Point i) {
		return new Vector(p.getX() - i.getX(), p.getY() - i.getY());
	}
	@Override
	public String toString() {
		return x+", "+y;
	}
}
