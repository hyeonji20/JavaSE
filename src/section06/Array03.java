package section06;

public class Array03 {
	public static void main(String[] args) {
		// new ������ ������� �ʰ� ���� �迭 �� �����ϱ�
		String[] pokemon = {"��ī��", "������", "���̸�", "���α�", "������", "�ߵ���"};
		
		//�迭 ��ü ���
		for(int i = 0; i < pokemon.length; i++) {
			System.out.println(pokemon[i]);
		}
		
		System.out.println("==============================");
		
		
		// �迭�� �����ϱ� ������ Ǫ������
		pokemon[1] = "Ǫ��";
		
		// Ȯ��for�� , ����for��
		for(String mon : pokemon) {
			// String mon = pockemon[0]
			// String mon = pockemon[1]
			// String mon = pockemon[2]
			// String mon = pockemon[3] . . . String mon = pockemon[6]
			System.out.println(mon);
			
		}
		
	}

}
