/* �� ���α׷��� ����īƮ�� ������ ��� ���ݰ� ������ �ľ��� �ݾ��� ������ִ� ���α׷��̴�. */
import java.util.*;			// util ��Ű���� Ŭ������ ��������

public class CarDriver {	// CarDriver Ŭ������ �Ӹ���
	public static void main(String []args) {	// main �޼ҵ��� �Ӹ���
		Scanner scan = new Scanner(System.in);	// Scanner ��ü�� �����ϰ� scan�� �� ��ü�� ����Ű�� ��
		String YN = "��";						// YN������ �����ϰ� "��"�� �ʱ�ȭ
		ShoppingCart cart = new ShoppingCart();	// ShoppingCart Ŭ������ ����Ű�� �������� test
		int Capacity = cart.cartSize;			// ��ٱ��� �뷮�� �����ϰ� ShoppingCart Ŭ������ cartSize ������ ����
		int n= 0;			// ShoppingCart Ŭ�������� �迭�� ���� �����ϴ� ����
		int m = 0;			// ShoppingCart Ŭ�������� �迭�� ���� �����ϴ� ����
		
		while (YN.equals("��")) {	// YN�� "��"��� �������� �ݺ�
			cart.Cart(n,m);		// cart�� ����Ű�� ShoppingCart��ü�� Cart �޼ҵ带 ȣ��
			cart.print(n,m);	// cart�� ����Ű�� ShoppingCart��ü�� print �޼ҵ带 ȣ��
			System.out.println("������ ����ϱ�ڽ��ϱ�?(�� Ȥ�� �ƴϿ�) :");	
			YN = scan.nextLine();	// YN�� �� or �ƴϿ��� �Է¹���
			if(YN.equals("��")) {	// YN�� "��"�϶�
				if((n+1) >= Capacity) {		// n+1�� ��ٱ��� �뷮���� ũ�ų� ���ٸ�(n+1�� ������ ũ�⸦ [5]�� �����ϸ� [0]~[4]���� �̱⶧��)
					System.out.println("��ٱ��ϰ� ����á���ϴ�.");
					break;			// �ݺ����� Ż���Ѵ�
				}
				n++;	// ��ٱ��� 5ĭ�� �Ѱ��� ĭ�� á���� ����ĭ�� �Է¹ޱ� ���� +1		
			}
		}
		cart.finalprint();	// cart�� ����Ű�� ShoppingCart��ü�� finalprint �޼ҵ带 ȣ��
		}
	}

