import java.util.*;		// util ��Ű���� Ŭ������ ��������

public class ShoppingCart {		// ShoppintCart Ŭ������ �Ӹ���	
	String []product = new String[5];	// ��ǰ�̸��� �޴� �����迭�� ���� (��ٱ���ĭ�� 5�̱� ������ [5])
	int [][]priceNum = new int[5][2];	// ��ǰ�� ���ݰ� ������ �޴� �����迭�� ����(��ٱ��� ĭ��ŭ 5�� �����ϰ� �ϳ��� ���� �� �ϳ��� �������� [2]�� ����)
	Item it = new Item();		// Item Ŭ������ ����Ű�� �������� it
	int cartSize=5;				// īƮ�뷮 ���� 5�� ����

	public void Cart(int n,int m) {		// Cart �޼ҵ��� �Ӹ���
		it.setProduct();					// it�� ����Ű�� Item��ü�� setProduct �޼ҵ带 ȣ��
		product[n] = it.getProduct();		// product�迭�� n��°�� it�� ����Ű�� Item��ü�� getProduct �޼ҵ�� ����
		it.setPrice();						// it�� ����Ű�� Item��ü�� setPrice �޼ҵ带 ȣ��
		priceNum[n][m] = it.getPrice();		// priceNum�迭�� n��°�� m��° �ε����� it�� ����Ű�� Item��ü�� getPrice �޼ҵ�� ����	
		m++;								// ������ �޾ƾ��ϱ� ������ m+1
		it.setQuantiry();					// it�� ����Ű�� Item��ü�� setQuantiry �޼ҵ带 ȣ��
		priceNum[n][m] = it.getQuantity();	// priceNum�迭�� n��°�� m��° �ε����� it�� ����Ű�� Item��ü�� getQuantity �޼ҵ�� ����
		m=0;								// ���� n��° ����, ������ �ޱ����� 0���� �ʱ�ȭ
		it.setproPrice();					// it�� ����Ű�� Item��ü�� setproPrice �޼ҵ带 ȣ��
		System.out.println("\n�ѱ��űݾ�: "+it.getproPrice());	// �� ���űݾװ� it�� ����Ű�� Item��ü�� getproPrice �޼ҵ带 ȣ��
	}
	
	public void print(int n,int m) {	// print �޼ҵ��� �Ӹ���
		System.out.println("��ٱ���\n");		
		System.out.println("��ǰ        ����     ����     �Ѿ�");
		for(int i=0;i<=n;i++) {				// ���ݱ��� ���Ÿ���� ����ϱ� ���� for��
			System.out.println(product[i]+"     "+priceNum[i][m]+"    "+priceNum[i][m+1]+"      "+priceNum[i][m]*priceNum[i][m+1]); // ��ǰ�� �̸��� ����, ����, �ݾ��� ���
		}
	}
	
	public void finalprint() {		// finalprint �޼ҵ��� �Ӹ���
		System.out.println("�����ϼ���.");
		System.out.println("�� �����ݾ�: "+ it.getproPrice());		// �� �����ݾװ� it�� ����Ű�� Item��ü�� getproPrice �޼ҵ带 ȣ��
	}
	 
	
}
