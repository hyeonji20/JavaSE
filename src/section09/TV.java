package section09;

public class TV {
	
	double size;  // ȭ��ũ��
	String resolution;  // �ػ�
	int year; 
	String brand;
	
	
	public TV() {   // default ������
		this.size = 80;
		this.resolution = "UHD(4K0)";
		this.year = 2023;
		this.brand = "�Ｚ";
		
	}
	
	// ������ �����ε�
	public TV(double size, String resolution, int year, String brand) {
		this.size = size;
		this.resolution = resolution;
		this.year = year;
		this.brand = brand;
	}
	
	public TV(String...options) {
		this();  // �ڱ��ڽ� ������ ȣ��
		getInfo();
		System.out.println("�߰� �ɼ� ���");
		for(String option : options) {
			System.out.println("option: " + option);
			
		}
	}
	
	
	public void getInfo() {
		System.out.println("size: " + size);
		System.out.println("resolution: " + resolution);
		System.out.println("year: " + year);
		System.out.println("brand: " + brand);
	}

}
