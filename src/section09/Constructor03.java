package section09;

public class Constructor03 {
	public static void main(String[] args) {
		TV tv1 = new TV();
		
		tv1.getInfo();
		
		System.out.println("=============================");
		
		TV tv2 = new TV(27, "FULL HD", 2023, "LG");
		
		tv2.getInfo();
		
		System.out.println("=============================");
		
		String[] options = {"������", "����Ʈ������", "���ͳݰ��ջ�ǰ��û(����)"};
		
		TV tv3 = new TV(options);
	}

}
