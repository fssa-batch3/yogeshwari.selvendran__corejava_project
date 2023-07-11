package day04.practice;

public class RightAngledTriangle extends Polygon {
	protected double base;
	protected double height;
	public RightAngledTriangle(double length, double breadth) throws Exception {
		super(3);
		if (base <= 0 || height <= 0) {
			throw new Exception("Invalid dimensions for a Triangle");
		}
		this.base = base;
		this.height = height;
	}
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return 1.0 / 2.0 * (this.base * this.height);
	}
	public int getNumberOfSides() {
		return super.numberOfSides;
	}
	@Override
	public double circumference() {
		double c = Math.round(Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2)));
		double circumference = base + height + c;
		return circumference;
	}
}