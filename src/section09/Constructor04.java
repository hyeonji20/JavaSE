package section09;

public class Constructor04 {
	
	static {
		System.out.println("Constructor04() static �ʱ�ȭ �� �Դϴ�. ");
	}
	
	{
		System.out.println("Constructor04() �ʱ�ȭ �� �Դϴ�. ");
	}
	
	
	
	public Constructor04() {
		System.out.println("Constructor04() ������ �Դϴ�. ");
	}
	
	public static void main(String[] args) {
		
		Constructor04 con04 = new Constructor04();
		
	}

}
