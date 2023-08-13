package section05;
/*
 * 반복문
 *  특정한 부분의 코드가 반복적으로 수행될 수 있도록 하는 명령어
 * 
 * 1. while문
 *  while(조건식) {
 *  	조건식 true 일 때 반복 수행할 코드
 *  }
 *  
 *  break문
 *   반복문에서 break문은 반복을 즉시 종료하는 명령어
 *  
 *  continue문
 *   반복문에서 해당 반복을 건너뛰고 다음 반복을 실행하도록 강제하는 명령어
 *    
 */
public class Loop01 {
	public static void main(String[] args) {
		//while문을 이용하여 0~99까지 출력 (아래 여러유형들)
		
//		int count = 0;
//		while(count < 100) {
//			System.out.println(count);
//			count++;
//		}
		
//		int count = 0;
//		boolean isRun = true;
//		while(isRun) {
//			System.out.println(count);
//			count++;
//			if(count == 100)
//				isRun = false;
//		}
		
//		int count = 0;
//		while(true) {
//			System.out.println(count);
//			count++;
//			if(count == 100)
//				break;
//		}
		
		int i = 0;
		while(i < 100) {
			i++;
			
			if(i % 3 == 0)   // 3의 배수는 제외하고 반복 (i++때문에 1더해져서 100까지 출력됨)
				continue;
			
			System.out.println(i);
		}
		
		
		
		
		
		
		
	}

}
