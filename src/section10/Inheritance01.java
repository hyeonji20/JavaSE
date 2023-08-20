package section10;

import section10.access1.Bicycle;
import section10.access1.MountainBike;

/*
 * ���(Inheritance)
 *  �θ� Ŭ����(����Ŭ����, ����Ŭ����)�� �ڽ�Ŭ����(����Ŭ����)�� ������
 *  �ڽ� Ŭ������ �θ� Ŭ������ ��ӹ޾� �� �θ��� ���(����, �޼���) ����� �����ϴ�.
 *  
 * ��� ���
 *  class �ڽ�Ŭ������ extends �θ�Ŭ������ 
 *  
 * ��Ű��(Package)
 *  ���õ� Ŭ����, �������̽� �� �׷�ȭ �ϴµ� ���Ǵ� ���丮
 *  
 *  �̸��浹 ���� : �����̸� Ŭ����, �������̽� ��Ű���� �޸��Ͽ� �浹����
 *  �ڵ� ����ȭ : ���õ� Ŭ������ ��Ű�� ������ �׷�ȭ
 *  ���� ���� : Ŭ������ ����� ���������ڸ� �����Ͽ�,
 *            �ش���Ű�� �ܺο��� ���� ���� ���� 
 *            
 * super Ű����
 *  �θ�ü�� �����ϴ� Ű����
 *  
 * *****�������̵�(Overriding)
 *  ��ӹ��� �޼��带 ����Ŭ�������� �������ϴ°��� ���Ѵ�.
 * 
 * ������̼�
 *  �ڹ� ���α׷��ֿ��� ��Ÿ�����͸� ��Ÿ����
 *  Ŭ����, �޼���, �������� ������� ������ �� �ִ�.
 *  
 *  ��) @Override - �޼��尡 ����Ŭ�������� �������̵��Ǿ����� ��Ÿ����.
 *                   
 *  
 */
public class Inheritance01 {
	public static void main(String[] args) {
		Bicycle bicycle1 = new Bicycle();
		
		bicycle1.handleType = "��������";
		bicycle1.gear = 7;
		bicycle1.wheel = 2;
		
		bicycle1.getInfo();
		
		System.out.println("=========================");
		
		MountainBike mBike = new MountainBike();
		mBike.handleType = "BMX �ڵ��";
		mBike.gear = 30;
		mBike.wheel = 2;
		mBike.isSuspension = true;
		
		mBike.getInfo();
		
		
	}

}
