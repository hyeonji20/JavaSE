package section08;
/*
 * this - �ڱ��ڽ��� ����Ű�� ����Ű����
 * 
 */
public class MemberVO {
	// private - �ڱ��ڽ� Ŭ���������� ���� ������ ����������
	private String id;
	private String pwd;
	private String name;
	private int age;
	private String mobile;     // private �� ���̰� �Ʒ��ٿ� ��Ŭ�� source + generate getters and setters �ϸ� ������.  
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age <= 0) {
			System.out.println("�߸��� ���� �Է��Ͽ����ϴ�. "); // [�����̱⶧���� ���ڰ� ���̳ʽ� �Ǹ� �ȵ�.]
			return;  // �޼��� ����  
		}
		this.age = age;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	

}
