package section05;
/*
 * �ݺ���
 *  Ư���� �κ��� �ڵ尡 �ݺ������� ����� �� �ֵ��� �ϴ� ��ɾ�
 * 
 * 1. while��
 *  while(���ǽ�) {
 *  	���ǽ� true �� �� �ݺ� ������ �ڵ�
 *  }
 *  
 *  break��
 *   �ݺ������� break���� �ݺ��� ��� �����ϴ� ��ɾ�
 *  
 *  continue��
 *   �ݺ������� �ش� �ݺ��� �ǳʶٰ� ���� �ݺ��� �����ϵ��� �����ϴ� ��ɾ�
 *    
 */
public class Loop01 {
	public static void main(String[] args) {
		//while���� �̿��Ͽ� 0~99���� ��� (�Ʒ� ����������)
		
//		int count = 0;
//		while(count < 100) {
//			System.out.println(count);
//			count++;
//		}
		
//		int count = 0;
//		boolean isRun = true;
//		while(isRun) {
//			System.out.println(count);
//			count++;
//			if(count == 100)
//				isRun = false;
//		}
		
//		int count = 0;
//		while(true) {
//			System.out.println(count);
//			count++;
//			if(count == 100)
//				break;
//		}
		
		int i = 0;
		while(i < 100) {
			i++;
			
			if(i % 3 == 0)   // 3�� ����� �����ϰ� �ݺ� (i++������ 1�������� 100���� ��µ�)
				continue;
			
			System.out.println(i);
		}
		
		
		
		
		
		
		
	}

}
