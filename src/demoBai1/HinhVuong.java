package demoBai1;

public class HinhVuong implements HinhHoc{
	private double length;
	
	public double getLength() {
		return length;
	}

	public HinhVuong(double length) {
		super();
		this.length = length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length*length;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return length*4;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Area: "+getArea());
		System.out.println("Perimeter: "+getPerimeter());
	}

}
