package section08;

public class Method03 {
	public static void main(String[] args) {
		printMember("025", "��ī��", 28);  // �ؿ� �Ű������� ���� ���缭 ����� �����Ϸ� ���� �ȳ�
	}
	
	//3. ���� O (�����Ű�����) ���� X -> ���� ���ڰ� �޾� �����ϰ� ������ �޼���
	public static void printMember(String id, String name, int age) {
		System.out.println("ID: " + id);
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age);
	}
	
	
	
}
