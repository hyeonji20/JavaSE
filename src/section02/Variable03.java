package section02;
/*
 * 3. ������
 *  byte    (1byte) : -128 ~ +127
 *  short   (2byte) : -32,768 ~ +32,767
 *  int     (4byte) : -2,147,483,648 ~ +2,147,483,647
 *  long    (8byte) : -9,223,372,036,854,775,808 ~ +9,223,372,036,854,775,807
 *  
 * 
 */

public class Variable03 {
	public static void main(String[] args) {
   		// ������ ���� ����� ���ÿ� �� �����ϱ�
		byte iByte = 10;
		short iShort = 100;
		int iInt = 10000;
		long iLong = 10000000;
		
		System.out.println("byte��: " + iByte);
		System.out.println("short��: " + iShort);
		System.out.println("int��: " + iInt);
		System.out.println("long��: " + iLong);
		
		iByte += 120;   // iByte = iByte + 120;
		System.out.println("byte overflow: " + iByte);
	}

}
