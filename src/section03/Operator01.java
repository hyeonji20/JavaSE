package section03;
/*
 * ������(Operator)
 *  ���α׷����� �����͸� ó���Ͽ� �����ϴ°��� ���� �̶� �Ѵ�.
 *  ���꿡 ���Ǵ� ǥ�ó� ��ȣ�� �����ڶ�� �Ѵ�.
 *  
 * 1. ���������
 *  ���� ���� ������ �������� ���� �����ϴ� ������.
 *  +, -, *, /, %(����������)
 *  
 */

public class Operator01 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		// �μ��� ��
		int sum = num1 + num2; // ���� + ���� = ����
		System.out.println("sum: " + sum); // ���ڿ� + ���� -> ���� ����� ���ڿ�
		
		String result;
		result = num1 + "+" + num2 + "=" + sum;
		System.out.println(result);
		
		// �μ��� �� ���ϱ�
		int multiply = num1 * num2;
		System.out.println("�μ��� ��: " + multiply);
		
		// ������ 
		int divide = num1 / num2;
		System.out.println("�μ� ������: " + divide);
		
		// ������ ��
		int remain = 9 % 5;
		System.out.println("9 % 5 = " + remain);
		
		
		
		
	}

}
