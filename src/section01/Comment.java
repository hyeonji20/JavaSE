package section01;
/*
 * �ּ�
 * �ڵ忡 ������ ���� �ʴ� �����ڰ� ����ϴ� �޸� ����
 * lic class Comment 
 * Ctrl+d �ٻ���
 * Ctrl+F11 ����
 * ������ �ּ�
 * alt+shift+javadoc �ּ� ����Ű
*/	

public class Comment{
public static void main(String[] args) {
	// ���� �ּ��� �����ϴ�
	System.out.println("Hello,JAVA!");
	
	getArea(10);
	
}	

    /**
     * ���� ���̱��ϱ�
     * 
     * ������(r)�� �Է��Ͽ� ���� ���̸� ����Ѵ�.
     * 
     * @param r- ������
     */
    public static void getArea(int r) 
    {
    	double area=Math.PI*Math.pow(r, 2);
    	System.out.println("���� ����:"+area);
    }
    
	
}