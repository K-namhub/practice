import java.util.*;		// util ��Ű���� Ŭ������ ��������

public class Item {		// item Ŭ������ �Ӹ���
	String product;		// ��ǰ�� �޴� ����	
	int price;			// ������ �޴� ����
	int quantity;		// ������ �޴� ����
	int sum = 0;		// ��ǰ ������ �� (0���� �ʱ�ȭ)

	public void setProduct() {		// setProduct �޼ҵ��� �Ӹ���
		System.out.println("�����ϴ� ��ǰ�� �̸��� �Է��ϼ��� : ");
		Scanner scan = new Scanner(System.in);		// Scanner ��ü�� �����ϰ� scan�� �� ��ü�� ����Ű�� ��
		product = scan.nextLine();					// product�� �Է¹���
		
	}
	
	public String getProduct() {	// getProduct �޼ҵ��� �Ӹ���
		return product;				// product ��ȯ
	}
	
	public void setPrice() {		// setPrice �޼ҵ��� �Ӹ���
		System.out.println("�����ϴ� ��ǰ�� ������ �Է��ϼ��� : ");
		Scanner scan = new Scanner(System.in);		// Scanner ��ü�� �����ϰ� scan�� �� ��ü�� ����Ű�� ��
		price = scan.nextInt();						// price�� �Է¹���
	}
	
	public int getPrice() {		// getPrice �޼ҵ��� �Ӹ���
		return price;			// price�� ��ȯ
	}	
	
	public void setQuantiry() {		// setQuantiry �޼ҵ��� �Ӹ���
		System.out.println("�����ϴ� ��ǰ�� ������ �Է��ϼ��� : ");
		Scanner scan = new Scanner(System.in);		// Scanner ��ü�� �����ϰ� scan�� �� ��ü�� ����Ű�� ��
		quantity = scan.nextInt();					// quantity�� �Է¹���
	}
	
	public int getQuantity() {		// getQuantity �޼ҵ��� �Ӹ���
		return quantity;			// quantity�� ��ȯ
	}
	
	public void setproPrice() {		// setproPrice �޼ҵ��� �Ӹ���
		sum += getPrice()*getQuantity();		// sum�� getPrice()*getQuantity()�� sum�� ���� ������ ���� (��ø�ǰ�)
	}
	
	public int getproPrice() {		// getproPrice �޼ҵ��� �Ӹ���
		return sum;					// sum�� ��ȯ
	}
	
	
}
