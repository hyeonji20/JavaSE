package section08;

public class Method08 {
	public static void main(String[] args) {
		int[] values = {1, 2, 3, 4, 5, 98};
		
		double[] result = summary(values);
		
		System.out.println("�հ�: " + result[0]);
		System.out.println("���: " + result[1]);
		
	}
	
	// ���� �迭 , ���� �迭 
	public static double[] summary(int... values) {
		
		// result[0] : �հ� , result[1] : ���
		double[] result = new double[2];
		
		int sum = 0;
		for(int value : values) {
			sum += value;
		}
		
		double avg = sum / (double)values.length;
		
		result[0] = sum;
		result[1] = avg;
		
		return result;
				
	}
	
}