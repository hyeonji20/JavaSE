package section03;
/*
 * 8. ���� ������
 *  ���ǽ� ? ���ǽ��� ���� ��� ��ȯ : ���ǽ��� ������ ��� ��ȯ
 *  
 * 
 */

public class Operator08 {
	
	public static void main(String[] args) {
		int num = 10;
		String result = num > 0 ? "num�� ���" : "num�� ����";
		
		System.out.println(result);
		
		String result2 = "";
		if(num > 0) {
			result2 = "num�� ���";
		} else {
			result2 = "num�� ����";
		}
		
		System.out.println(result2);
		
		int x = 8;
		int y = 12;
		
		int max = (x > y) ? x : y; // x�� y �� ū ���� ����
		System.out.println("�� �� �� ū ����: " + max);
		
		// ���׿����ڸ� ��ø�ؼ� ����ϱ� 
		int a = 5;
		int b = 3;
		int c = 7;
		int largest = (a > b) ? ((a>c) ? a : c) : ((b>c) ? b:c);
		System.out.println("�� �� �� ���� ū ����: " + largest);
		
		
	}

}
