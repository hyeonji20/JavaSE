package section06;

public class Array02 {
	public static void main(String[] args) {
		// ���ڿ� �迭��ü �����ϱ�
		String[] pokemon = new String[6];
		
		// �迭 �� �����ϱ�
		pokemon[0] = "��ī��";
		pokemon[1] = "������";
		pokemon[2] = "���̸�";
		pokemon[3] = "���α�";
		pokemon[4] = "������";
		pokemon[5] = "�ߵ���";
		
		// �� ��������
		System.out.println(pokemon[3]);
		
		// �迭�� ����
		System.out.println(pokemon.length);
		
		// for ���� �̿��Ͽ� �迭 ��ü ����ϱ�
		for(int i = 0; i < pokemon.length; i++);
			System.out.println(pokemon);
	}

}
