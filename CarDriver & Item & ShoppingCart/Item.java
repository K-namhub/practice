import java.util.*;		// util 패키지의 클래스를 선언해줌

public class Item {		// item 클래스의 머리부
	String product;		// 상품을 받는 변수	
	int price;			// 가격을 받는 변수
	int quantity;		// 수량을 받는 변수
	int sum = 0;		// 상품 가격의 합 (0으로 초기화)

	public void setProduct() {		// setProduct 메소드의 머리부
		System.out.println("구매하는 상품의 이름을 입력하세요 : ");
		Scanner scan = new Scanner(System.in);		// Scanner 객체를 생성하고 scan이 그 객체를 가리키게 함
		product = scan.nextLine();					// product를 입력받음
		
	}
	
	public String getProduct() {	// getProduct 메소드의 머리부
		return product;				// product 반환
	}
	
	public void setPrice() {		// setPrice 메소드의 머리부
		System.out.println("구매하는 상품의 가격을 입력하세요 : ");
		Scanner scan = new Scanner(System.in);		// Scanner 객체를 생성하고 scan이 그 객체를 가리키게 함
		price = scan.nextInt();						// price를 입력받음
	}
	
	public int getPrice() {		// getPrice 메소드의 머리부
		return price;			// price를 반환
	}	
	
	public void setQuantiry() {		// setQuantiry 메소드의 머리부
		System.out.println("구매하는 상품의 수량을 입력하세요 : ");
		Scanner scan = new Scanner(System.in);		// Scanner 객체를 생성하고 scan이 그 객체를 가리키게 함
		quantity = scan.nextInt();					// quantity를 입력받음
	}
	
	public int getQuantity() {		// getQuantity 메소드의 머리부
		return quantity;			// quantity를 반환
	}
	
	public void setproPrice() {		// setproPrice 메소드의 머리부
		sum += getPrice()*getQuantity();		// sum을 getPrice()*getQuantity()에 sum을 더한 것으로 지정 (중첩되게)
	}
	
	public int getproPrice() {		// getproPrice 메소드의 머리부
		return sum;					// sum을 반환
	}
	
	
}
