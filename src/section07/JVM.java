package section07;
/*
 *  JVM(Java Virtual Machine)
 *    �ڹ� ���ø�Ŀ������ �����ϱ� ���� ����ӽ�.
 *    JVM�� �ü���� �ڹ� ���ø����̼� ���� �߰��� ������ �Ѵ�.
 *    
 *  JVM �޸� ����
 *   1. �޼��� ����(Method Area) or Ŭ���� ����(Class Area)
 *       JVM�� �����ϴ� ���ø����̼� ���Ǵ� Ŭ���� ���� ����
 *       JVM ���۵� �� Ŭ���� �δ��� ���� �δ��Ǹ�, ��� �����尡 ����.
 *   
 *   2. �� ���� (Heap Area)
 *       ��ü �ν��Ͻ��� ����Ǵ� ����, �������� ������ ��ü���� �Ҵ�ȴ�.
 *       
 *   3. ���� ����(Stack Area)
 *       �޼��� ȣ��� ���õ�����(���ú���, �Ű�����, �޼��� ȣ�� ��) ����.
 *       
 *   4. PC ��������(Program Counter Register)
 *       ���� ���� ���� ��ɾ��� �ּҸ� ����Ű�� ������
 *       
 *   5. ����Ƽ�� �޼��� ����(Native Method Stack)
 *       �ڹ� �ڵ� �ܺ��� ����Ƽ�� �ڵ�(C, C++ ��)�� ������ �� ���.            
 * 
 */
public class JVM {
	public static void main(String[] args) {
		// ��ü �ּҰ� ����ϱ�
		Car car1 = new Car();
		Car car2 = new Car();
		
		System.out.println(System.identityHashCode(car1));
		System.out.println(System.identityHashCode(car2));
	}

}
