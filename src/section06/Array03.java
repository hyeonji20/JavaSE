package section06;

public class Array03 {
	public static void main(String[] args) {
		// new 연산자 사용하지 않고 직접 배열 값 대입하기
		String[] pokemon = {"피카츄", "라이츄", "파이리", "꼬부기", "버터플", "야도란"};
		
		//배열 전체 충력
		for(int i = 0; i < pokemon.length; i++) {
			System.out.println(pokemon[i]);
		}
		
		System.out.println("==============================");
		
		
		// 배열값 수정하기 라이츄를 푸린으로
		pokemon[1] = "푸린";
		
		// 확장for문 , 향상된for문
		for(String mon : pokemon) {
			// String mon = pockemon[0]
			// String mon = pockemon[1]
			// String mon = pockemon[2]
			// String mon = pockemon[3] . . . String mon = pockemon[6]
			System.out.println(mon);
			
		}
		
	}

}
