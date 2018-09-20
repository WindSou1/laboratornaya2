package labor2;

public class TestCircle {
	public static void main(String [] args) {
		Circle c1 = new Circle (7.0, 4.0, 5.0);
		Circle c2 = new Circle (10.0, 4.0, 9.0);
		c1.setY(100.0);
		c2.setX(44.0);
		System.out.println(c1.toString());
		System.out.println(c1.dlinaCircle(c1.getRadius()));
		System.out.println(c2.toString());
		System.out.println(c2.dlinaCircle(c2.getRadius()));
	}
}
