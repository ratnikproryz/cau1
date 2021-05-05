package demoBai1;

public class mainRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hinh chu nhat:");
		HinhHoc hcn=new HinhCHuNhat(4, 5);
		hcn.display();
		System.out.println("Hinh vuong:");
		HinhHoc hv= new HinhVuong(6.5);
		hv.display();
	}

}
