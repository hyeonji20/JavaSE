package section09;

public class Book {
	String title;
	int price;
	int totalPage;
	String author;
	
	// ������ - ��ü ������ ���� 
	// this - �ڱ��ڽ� ���� Ű����
	public Book() {
		// ��� �ʱ�ȭ
		this.title = "���侾���� �ڹ�";
		this.price = 32000;
		this.totalPage = 603;
		this.author = "�迵��";
		
		getInfo();
		
	}
	
	
	public void getInfo() {
		System.out.println("title: " + title);
		System.out.println("price: " + price);
		System.out.println("totalPage: " + totalPage);
		System.out.println("author: " + author);
	}

	
}
