package section08;
/*
 * VO (Value Object), DTO(Data Transfer Object)
 *  �� ������Ʈ�ν� ������ �´� ������ ����.
 *  Database �Ǵ� ��Ʈ��ũ ��� �� �� ��ݿ����� ���ȴ�.
 *  
 *  ĸ��ȭ(��������) - ��ü�� �Ӽ��� ������ �ϳ��� ����
 *  				�ܺηκ��� ���θ� ���� ���� �����Ѵ�. 
 * 
 */

public class Method10 {
	public static void main(String[] args) {
		MemberVO memberVO = new MemberVO();
		
		memberVO.setId("abc");
		memberVO.setPwd("abc123!@#");
		memberVO.setName("ȫ�浿");
		memberVO.setAge(17);
		memberVO.setMobile("01012345678");
		
		String id = memberVO.getId();
		String pwd = memberVO.getPwd();
		String name = memberVO.getName();
		int age = memberVO.getAge();
		String mobile = memberVO.getMobile();
		
		System.out.println("id: " + id);
		System.out.println("pwd: " + pwd);
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		System.out.println("mobile: " + mobile);
		
		
		
	}

}
