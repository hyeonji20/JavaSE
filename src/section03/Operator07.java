package section03;
/*
 * 7. ����Ʈ ������
 *  >>(������ ����Ʈ) : ��ȣ�� �����ϸ鼭 ������ ����ŭ ���������� ��Ʈ�̵���Ų��. 
 *  <<(���� ����Ʈ) : ��ȣ��Ʈ�� ������ �����ʰ� �������� ��Ʈ�̵���Ų��.
 *  
 */

public class Operator07 {
	
	public static void main(String[] args) {
		int num = 10;  // 10�� 2�����δ� 1010
		int leftNum = num << 2;  // �������� 2��Ʈ �̵� 101000
		int rightNum = num >> 1;  // ���������� 1��Ʈ �̵� 0101
		
		System.out.println("Org Num: " + num);
		System.out.println("Left Shift Num by 2 : " + leftNum);
		System.out.println("Gight Shift Num by 2 : " + rightNum);
	
	}

}
