package section07;
/*
 * ���(Constant)
 *  ���α׷������� ������ �ʴ� ���� ��Ÿ����
 *  �� ���� �ѹ� �������� ������ �� ����.
 *  ���� �빮�ڷ� �����Ѵ�. 
 *  
 *  final Ű���� ���
 * 
 */

public class Constant01 {
	
	static final double PI = 3.141592;  // ���������� main�̶� ������ �־����
	
	
	
	public static void main(String[] args) {
		// ���� ������
		int r = 10;
		
		// ���� ���� ���ϱ�
		double area = PI * r * r;
		System.out.println("���� ����: " + area);
		
		area = 0; // 0���� �ʱ�ȭ
		
		area = Math.PI * Math.pow(r, 2);
		System.out.println("Math�� �̿��� ���� ����: " + area);
		
	}

}
