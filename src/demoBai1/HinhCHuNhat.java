package demoBai1;

public class HinhCHuNhat implements HinhHoc {
	private double length;
	private double width;
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	
	
	public HinhCHuNhat(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length*width;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return (length+width)*2;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Area: "+getArea());
		System.out.println("Perimeter: "+getPerimeter());
	}
	
}
