package section08;

public class Method06 {
	public static void main(String[] args) {
		
		String pokemon = getPokemon();  // String pokemon = "피카츄"; 와 같다고 생각해도 무방
		
		System.out.println("pokemon: " + pokemon);
		
	}
	
	// 6. 인자 X 리턴 O - 메서드 호출시 값 반환
	public static String getPokemon() {
		String pokemon = "피카츄";
		
		return pokemon;
		
	}
	
}
