package section02;

import java.math.BigDecimal;

/*
 * ������ ǥ�����
 *  ����ǥ��
 *      ��ǻ�ʹ� 2������ ǥ��(bit)
 *      ��ȣ��Ʈ(Most Significant Bit) + ��ġ��Ʈ
 *      ���� ���� ǥ���� �� 2�Ǻ��� ǥ��
 *      
 *  �Ǽ�ǥ�� (�ε��Ҽ�ǥ��)
 *  	������(e)��Ʈ + ������(m)��Ʈ
 *  �Ǽ�ǥ�� ����
 *  	��(1.m)*^(e��127) 
 *  �ε��Ҽ�������
 *  	��ǻ�Ͱ� ��Ȯ�� �Ǽ�ǥ�� �Ұ��� �ٻ�ġ �� ǥ������ ���� ���� ����   
 */

public class Variabe05 {
	public static void main(String[] args) {
		float f = 0.0f;
		double d = 0.0;
		BigDecimal bd = new BigDecimal(0.0);
		
		// for �ݺ���
		for(int i = 0; i < 100; i++) { // i�� 0, 1, 2, . . . 100
			f += 0.1f;
			d += 0.1;
			bd = bd.add(new BigDecimal(0.1));
		}
		// 0.1 * 100 = 10
		System.out.println("f�� ��: " + f);
		System.out.println("d�� ��: " + d);
		System.out.println("bd�� ��: " + bd);
	}

}
