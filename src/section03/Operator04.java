package section03;
/*
 * 4. �� ������ 
 *  || (shift + \) : OR ����, ������ ����, �� �� �� �ϳ� �̻� true �� �� true
 *  && : AND ����, ������ ����, �� �� ��� true �� �� true
 *  ! : NOT ����, ������ ����, ��(boolean)�� ���� ��Ų��.
 */
public class Operator04 {
	public static void main(String[] args) {
		boolean result = true && false;
		System.out.println("result: " + result);
		
		boolean result2 = true || false; // �ϳ��� true�� true ���
		System.out.println("result2: " + result2);
		
		boolean result3 = true;
		System.out.println("!result3: " + !result3);
		
		String order = "�Ƿ�";
		if (order == "��ǰ" || order == "��������" || order == "�Ƿ�") {
			System.out.println("20% ���� ��� ���Դϴ�. ");
		} else {
			System.out.println("���� ������ ��ǰ�Դϴ�. ");
		}
		
		
	}

}
