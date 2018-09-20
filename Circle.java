package labor2;

public class Circle {
	public double radius;
	public double diameter;
	public double x;
	public double y;
	public Circle(double radius, double x, double y) {
		setRadius(radius);
		setDiameter(radius * 2);
		setX(x);
		setY(y);
	}
	public double dlinaCircle(double radius) {
		return 2 * Math.PI * radius;						
	}

	public double getDiameter() {
		return diameter;
	}
	public double getRadius() {
		return radius;
	}
	public double getY() {
		return y;
	}
	public double getX() {
		return x;
	}
	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void setY(double y) {
		this.y = y;
	}
	public void setX(double x) {
		this.x = x;
	}
	
    public String toString() {
        return "Circle radius: "+this.radius+"; Diameter: "+this.diameter+"; x: "+this.x+", y: "+this.y+").";
    }
}
