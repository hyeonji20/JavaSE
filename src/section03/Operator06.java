package section03;
/*
 * 6. ��Ʈ ������
 *  2������ ǥ���� �� ��Ʈ ������
 *  
 *  & : �����Ǵ� ��Ʈ�� ��� 1�̸� 1�� ��ȯ(��Ʈ AND������)
 *  | : �����Ǵ� ��Ʈ �߿��� �ϳ��� 1�̸� 1�� ��ȯ(��Ʈ OR������)
 *  ^ : �����Ǵ� ��Ʈ�� ���� �ٸ��� 1�� ��ȯ(��Ʈ XOR������-EXCLUSIVE OR)
 *  ~ : �����Ǵ� ��Ʈ�� 1�̸� 0����, 0�̸� 1�� ������Ŵ(��Ʈ NOT������)
 *  
 *  ctrl + d : �ٻ���
 */

public class Operator06 {
	
	public static void main(String[] args) {
		int num1 = 3; // 0 0011 
		int num2 = 5; // 0 0101
		
		System.out.println("num1 & num2: " + (num1&num2));
		System.out.println("num1 | num2: " + (num1|num2));
		System.out.println("num1 ^ num2: " + (num1^num2));
		
		// 3: 0 0011
		// -3: 1 1100 -> -12? �ƴ϶� -4 ????
		// ��ǻ�ʹ� ������ 2�� ������ �����Ѵ�.
		System.out.println("~num: " + ~num1);
		
	}
}
