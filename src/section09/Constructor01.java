package section09;
/*
 * ������(Constructor)
 *  ��ü�� ������ �� ����Ǵ� ��ȯ�� ���� �޼���
 *  ��ü �ʱ�ȭ ������ �ַ� ���ȴ�.
 *  Ŭ������� �����ϴ�.
 * 
 */

public class Constructor01 {
	public static void main(String[] args) {
		Book book1 = new Book();
		
		book1.getInfo();
		
		book1.title = "�̹���";
		book1.price = 9000;
		book1.totalPage = 280;
		book1.author = "�˺��� ī��";
		
		System.out.println("=================");
		
		book1.getInfo();
		
		
	}

}
