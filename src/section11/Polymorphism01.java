package section11;

import section11.access1.Bus;
import section11.access1.Car;

/*
 * ������(Polymorphism)
 *  ���� �������̽� �Ǵ� �θ�Ŭ������ �����ϴ� ��ü��
 *  ���� ������ Ÿ���� ���� �� �ִ� ����� ���Ѵ�. 
 *  
 * 
 */
public class Polymorphism01 {
	public static void main(String[] args) {
		Bus bus1 = new Bus();
		bus1.drive();
		bus1.clickBell();
		
		Car car = new Bus();
		
	}

}
