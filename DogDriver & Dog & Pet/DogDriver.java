/* �� ���α׷��� ���� �̸�,����,ǰ��,�������� ���θ� �޾� ������ִ� ���α׷��̴�. */
import java.util.*;		// util ��Ű���� Ŭ������ ��������

public class DogDriver {	// DogDriverŬ������ �Ӹ���
	public static void main(String []args) {	// main�޼ҵ��� �Ӹ���
		String name;		// �̸��� �޴� ����
		String YN;			// ��, �ƴϿ��� �޴� ����
		String dogbreed;	// ǰ���� �ޱ� ���� ����
		int age;			// ���̸� �ޱ� ���� ����

		Dog n = new Dog("�Ϸ�",3,"������",true);		// DogŬ������ ����Ű�� ��������  n (���� �ʱ�ȭ����)
		Scanner scan = new Scanner(System.in);		// Scanner ��ü�� �����ϰ� scan�� �� ��ü�� ����Ű�� ��
		System.out.println("���� �̸��� �Է��ϼ���.: ");	
		name = scan.nextLine();						// name�� �Է¹��� ���� ����
		System.out.println("���� ���̸� �Է��ϼ���.: ");
		age = scan.nextInt();						// age�� �Է¹��� ���� ����
		scan.nextLine();							// nextInt() ���� nextLine()�� �޾��ֱ� ���� ����(�� ������ ������ ���� �� ����)
		System.out.println("���� ǰ���� �Է��ϼ���.: ");	
		dogbreed = scan.nextLine();					// dogbreed�� �Է¹��� ���� ����
		System.out.println("�����ֻ縦 �¾ҳ���(�� Ȥ�� �ƴϿ�)?: ");
		YN = scan.nextLine();						// YN�� �Է¹��� ���� ����
		n.print();									// n�� ����Ű�� DogŬ������ print�޼ҵ带 ȣ��
		
		if(YN.equals("��")) {		// YN�� �����
			n= new Dog(name,age,dogbreed,true);		// n�� ����Ű�� DogŬ������ ���ο� ���� ����
			n.print();								// n�� ����Ű�� DogŬ������ print�޼ҵ带 ȣ�� 
		}else {			// �ƴϸ�								
			n= new Dog(name,age,dogbreed,false);	// n�� ����Ű�� DogŬ������ ���ο� ���� ����
			n.print();								// n�� ����Ű�� DogŬ������ print�޼ҵ带 ȣ�� 
			if(n.age >2) {		// n�� ����Ű�� DogŬ������ age������ 2���� ũ�ٸ�
				System.out.println("���� ������ �λ��� �Ѿ����� �����ֻ縦 ���� �ʾҴ�. :");
				System.out.println(n.petTotal());		// n�� ����Ű�� DogŬ������ petTotalŬ������ ���
			}
		}		
	}
}
