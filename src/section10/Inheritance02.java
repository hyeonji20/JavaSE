package section10;

import section10.access2.Car;

/*
 * ���� ������(Access Modifier)
 *  �ڹٿ��� Ŭ����, �������, ����޼��� �� ���� ������ �����ϴµ� ���Ǵ� Ű����
 *  public     - ��� Ŭ�������� ���� ����.
 *  protected  - ���� ��Ű�� �Ǵ� ��� ���迡�� ���� ����.
 *  default    - ���� ��Ű������ ���� ����.
 *  private    - ���� Ŭ���� ������ ���� ����.
 *  
 * import Ű���� 
 *  �ٸ� ��Ű���� ���� Ŭ������ ����ϱ� ���� �����ϴ� Ű����.  
 * 
 * 
 */

public class Inheritance02 {
	
	public static void main(String[] args) {
		Car car = new Car();
		car.model = "���׽ý� GV80";
//	    car.color = "black";  // protected �ٸ���Ű�� ���ٺҰ� !!
//		car.year = 2023;      // default �ٸ���Ű�� ���ٺҰ� !!
//		car.brand = "Hyundai"; // private �ٸ�Ŭ���� ���ٺҰ� !!
	}

}
