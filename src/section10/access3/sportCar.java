package section10.access3;

import section10.access2.Car;

public class sportCar extends Car {
	public boolean isOpen;
	
	@Override
	public void getInfo() {
		System.out.println("model: " + model);
		System.out.println("color: " + color);  // ��Ӱ��� ���� ����
//		System.out.println("year: " + year);   // ���� ��Ű���� ����
//		System.out.println("brand: " + brand);  // ���� Ŭ������������ ����
		System.out.println("isOpen: " + isOpen);
	}

}
