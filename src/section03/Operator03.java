package section03;

import java.util.Scanner;

/*
 * 3. �� ������
 *  ���� ����� ���Ͽ� boolean���� ��ȯ�Ѵ�.
 *  >   : ũ��
 *  >=  : ũ�ų� ����
 *  <   : �۴�
 *  <=  : �۰ų� ���� 
 *  ==  : ����
 *  !=  : �ٸ���
 * 
 */

public class Operator03 {
	public static void main(String[] args) {
		boolean result = 10 < 20;
		System.out.println("result: " + result);
		
		if (result) {
			System.out.println("10�� 20���� �۴�. ");
		} else {
			System.out.println("10�� 20���� ũ��. ");
			
		Scanner scan = new Scanner (System.in);
		System.out.println("���̸� �Է��ϼ��� >>>");
		int age = scan.nextInt();
		if (age >= 19) {
			System.out.println("�� 19�� �̻��Դϴ�. ");
		} else {
			System.out.println("�̼����� �Դϴ�. ");
		}
			
			
			
		}
		
		
		
		
	}

}
