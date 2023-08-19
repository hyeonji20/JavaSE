package section08;
/*
 * �����ε�(Overloading)
 *  Ŭ���� ������ ���� �̸��� ���� �޼��带 ������ �����ϴ� ���� ���Ѵ�.
 *  �Ű����� ���� �Ǵ� Ÿ���� �ٸ��� �����ϴ�. 
 * 
 */

public class Method04 {
	
	public static void main(String[] args) {
		printPokemon("025", "��ī��");
		printPokemon("025", "��ī��", "����");
		printPokemon(25, "��ī��");
		
	}
	
	// 3�� ����(Method03)
	public static void printPokemon(String no, String name) {
		System.out.println("No. " + no);
		System.out.println("Name. " + name);
	}
	
	// 4. ****�����ε�(Overloading) �޼���
	public static void printPokemon(String no, String name, String type) {
		System.out.println("No. " + no);
		System.out.println("Name. " + name);
		System.out.println("Type. " + type);
	}
	
	// Ÿ�Ը� �޶����� �����ε��� �����ϴ�.
	public static void printPokemon(int no, String name) {
		System.out.println("No. " + no);
		System.out.println("Name. " + name);
	}
	
}
