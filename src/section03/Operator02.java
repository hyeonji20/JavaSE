package section03;
/*
 * 2. ����������
 *  ++ : �ǿ����� 1�� ������Ų��.
 *  -- : �ǿ����� 1�� ���ҽ�Ų��.
 * 
 */

public class Operator02 {
	public static void main(String[] args) {
		
		int num = 0;
		
		num = num + 1;
		System.out.println(num);   // num = 1
		num ++;
		System.out.println(num);   // num = 2
		
		// ���� ���������� - ��ɾ ���� �� 1����
		System.out.println(++num); // num = 3
		// ���� ���������� - ��ɾ ���� �� 1����
		System.out.println(num++); // num = 3  4�� �ƴ� !
		System.out.println(num);   // num = 4 #���� ���������ڴ� ����Ʈ���� �����̱⿡ �ʰ� �������� �׷��� �ٽ��ѹ� ����Ʈ ����� ���ڰ� ����Ǿ� ���´�. 
		
	}

}
