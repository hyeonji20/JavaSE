package section02;
/*
 * 5. String �� (���ڿ�)
 *  ���ڿ��� ������ �� �ִ�.
 *  ������ ����
 *  
 * ������
 *  String ������;
 * 
 * 
 * �⺻�� - boolean, char, byte, short, int, long, float, double
 * 		  ���� ���� �����ϰ� �ִ� ����
 * ������ - �⺻���� ������ ��� ��ü(class �ڵ�� �Ǿ��ִ�.)
 * 		  �ּ� ���� �����ϰ� �ִ�.
 *        ��ü���� �Ӽ�(��-����), ���(�޼���)
 */

public class Variable06 {
	public static void main(String[] args) {
		String str = "�ȳ��ϼ���.";
		System.out.println("str: " + str);
		
		
		/*
		 * 
		 * h e l l o
		 * 0 1 2 3 4 ��°�� => �ε��� ��ȣ
		 * 
		 */
		
		
		
		
		String hello = "hello";
		System.out.println("1�� �ε���: " + hello.charAt(1));
		System.out.println("2�� �ε��� ���� 4�� �ε��� ������: " + hello.substring(2,4));
		
		
		String addr = "���� Ư���� ���빮�� ����";
		boolean isContain = addr.contains("Ư����");
		
		
		// if ���ǹ�
		if(isContain) {
			System.out.println("Ư���ù� �Դϴ�.");
		}else {
			System.out.println("Ư���ù��� �ƴմϴ�. �Ф�");
		}
				
	}

}
