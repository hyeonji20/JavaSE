package section04;
/*
 * ��� 
 *  ���α׷� ���� �帧�� �����ϱ� ���� ���Ǵ� ����
 *  
 * ���ǹ�
 *  �־��� ���ǽ��� ����� ���� ������ ����� �����ϵ��� �����ϴ� ��ɹ� 
 * 
 * 1. if��
 *  if(���ǽ�){
 * 		���ǽ��� true �� �� ����Ǵ� �ڵ念��
 *  }
 *  
 *  if(���ǽ�) 
 *  	���ǽ��� true �� �� �����ɹ� (��ɹ� ����(;) �߰�ȣ ��������)
 */

public class Conditional01 {
	
	public static void main(String[] args) {
		int num = 11;
		if(num % 2 == 0) {
			System.out.println("num�� ¦�� �Դϴ�. ");
		}
		if(num % 2 != 0) {
			System.out.println("num�� Ȧ�� �Դϴ�. ");
		}
		if(num % 2 == 0) 
			System.out.println("num�� ¦�� �Դϴ�. ");
		
		if(num % 2 != 0) 
			System.out.println("num�� Ȧ�� �Դϴ�. ");
		
	
	
	
	}
	


}
