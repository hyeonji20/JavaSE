package section02;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name,address;
	    int age;	
	    double weight;	
		
	System.out.println("�̸�, �ּ�, ����, ü���� ��ĭ���� �����Ͽ� ������� �Է��Ͻÿ�. ");
	name = scan.next();
	address = scan.next();
	age = scan.nextInt();
	weight = scan.nextDouble();	
	
	System.out.printf("����� �̸��� %s �Դϴ�.\n", name);
	System.out.printf("����� �ּ��� %s �Դϴ�.\n", address);	
	System.out.printf("����� ������ %d �Դϴ�.\n", age);	
	System.out.printf("����� ü���� %.1kg �Դϴ�.\n", weight);	
		
		
	}

}
