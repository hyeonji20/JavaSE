package section08;

public class Method07 {
	public static void main(String[] args) {
		
		int result = add(24, 55, 77);
		System.out.println("result: " + result);
	}
	
	// 7. ���� O ���� X -> ���ڰ��� �޾� ���� �� ��ȯ���� �ش�.
	public static int add(int a, int b) {
		return a + b;
	}
	
	// �����ε� �޼��� 
	public static int add(int a, int b, int c) {
		return a + b + c;
	}
	
}
