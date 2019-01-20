package learn.mathforgame.subtractVector;

public class Main {
	public static void main(String[] args) {
		Point p = new Point(0, -1);
		Point i = new Point(1, 1);
		Vector v = new Vector().subtractPoint(p, i);
		System.out.println("Result: "+v);
	}
}
