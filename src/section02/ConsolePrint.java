package section02;
/*
 * ��¹�
 * �����͸� ȭ�鿡 ����ϴ� ���
 * System.out.println():��ȣ�� ���� ��� �� �� �ٲ�
 * System.out.print():��ȣ�� ���� ����� �� �ٲ�(x)
 * System.out.printf():���ڿ� ���Ĺ��ڸ� �̿���
 *                     ����Ӥ�ȭ�� ���� ��� �� �ٲ�(x)
 *                     
 *            ���Ĺ���
 *                     %d:����(10����)
 *                     %o:����(8����)
 *                     %x:���� (16����)
 *                     %f:�Ǽ�
 *                     %e:����(eǥ�� ���)
 *                     %s:���ڿ�
 *                     %c:����
 * 
 * 
 * 
 */
public class ConsolePrint {
	public static void main(String[] args) {
		System.out.print("Welcome. ");
		System.out.println("JAVA World");
		
		System.out.printf("������ %d�� %d�� �Դϴ�.\n",8,5);
		
		System.out.printf("%d�� ù����,%f�� �ι���,%c�� ������",1,2.0,'��');
		
	}

}
