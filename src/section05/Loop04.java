package section05;
/*
 * 중첩 반복문
 *  반복은 안에 반복문
 *  
 * 
 */
public class Loop04 {
	public static void main(String[] args) {
		int num = 0;
		
		for(int i = 0; i <7; i++) {
			
			for(int j = 0; i <7; j++) {   // 이중 for 무
			
				
			    System.out.println("*");
				System.out.println(num);
				num++;
			}
		}
	}

}
