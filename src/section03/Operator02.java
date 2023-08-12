package section03;
/*
 * 2. 증감연산자
 *  ++ : 피연산자 1씩 증가시킨다.
 *  -- : 피연산자 1씩 감소시킨다.
 * 
 */

public class Operator02 {
	public static void main(String[] args) {
		
		int num = 0;
		
		num = num + 1;
		System.out.println(num);   // num = 1
		num ++;
		System.out.println(num);   // num = 2
		
		// 전위 증감연산자 - 명령어가 실행 전 1증가
		System.out.println(++num); // num = 3
		// 후위 증감연산자 - 명령어가 실행 후 1증가
		System.out.println(num++); // num = 3  4가 아님 !
		System.out.println(num);   // num = 4 #후위 증감연산자는 프린트인이 먼저이기에 늦게 더해진다 그래서 다시한번 프린트 해줘야 숫자가 연산되어 나온다. 
		
	}

}
