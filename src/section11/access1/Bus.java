package section11.access1;

public class Bus extends Car {
	
	public Bus() {
		color = "Green";
		type = "����";
		
	}
	
	@Override
	public void drive() {
		System.out.println("�°��� �¿�� ������ �մϴ�.");
		
	}
	
	public void clickBell() {
		System.out.println("������ ���� �����ϴ�.");
	}
}
