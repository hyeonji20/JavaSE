package section02;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name,address;
	    int age;	
	    double weight;	
		
	System.out.println("이름, 주소, 나이, 체중을 빈칸으로 구분하여 순서대로 입력하시오. ");
	name = scan.next();
	address = scan.next();
	age = scan.nextInt();
	weight = scan.nextDouble();	
	
	System.out.printf("당신의 이름은 %s 입니다.\n", name);
	System.out.printf("당신의 주소은 %s 입니다.\n", address);	
	System.out.printf("당신의 나이은 %d 입니다.\n", age);	
	System.out.printf("당신의 체중은 %.1kg 입니다.\n", weight);	
		
		
	}

}
