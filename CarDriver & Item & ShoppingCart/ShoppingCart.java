import java.util.*;		// util 패키지의 클래스를 선언해줌

public class ShoppingCart {		// ShoppintCart 클래스의 머리부	
	String []product = new String[5];	// 상품이름을 받는 변수배열을 선언 (장바구니칸이 5이기 때문에 [5])
	int [][]priceNum = new int[5][2];	// 상품의 가격과 수량을 받는 변수배열을 선언(장바구니 칸만큼 5로 지정하고 하나는 가격 또 하나는 수량으로 [2]로 선언)
	Item it = new Item();		// Item 클래스를 가리키는 참조변수 it
	int cartSize=5;				// 카트용량 변수 5로 지정

	public void Cart(int n,int m) {		// Cart 메소드의 머리부
		it.setProduct();					// it이 가리키는 Item객체의 setProduct 메소드를 호출
		product[n] = it.getProduct();		// product배열의 n번째를 it이 가리키는 Item객체의 getProduct 메소드로 지정
		it.setPrice();						// it이 가리키는 Item객체의 setPrice 메소드를 호출
		priceNum[n][m] = it.getPrice();		// priceNum배열의 n번째의 m번째 인덱스에 it이 가리키는 Item객체의 getPrice 메소드로 지정	
		m++;								// 수량을 받아야하기 때문에 m+1
		it.setQuantiry();					// it이 가리키는 Item객체의 setQuantiry 메소드를 호출
		priceNum[n][m] = it.getQuantity();	// priceNum배열의 n번째의 m번째 인덱스에 it이 가리키는 Item객체의 getQuantity 메소드로 지정
		m=0;								// 다음 n번째 가격, 수량을 받기위해 0으로 초기화
		it.setproPrice();					// it이 가리키는 Item객체의 setproPrice 메소드를 호출
		System.out.println("\n총구매금액: "+it.getproPrice());	// 총 구매금액과 it이 가리키는 Item객체의 getproPrice 메소드를 호출
	}
	
	public void print(int n,int m) {	// print 메소드의 머리부
		System.out.println("장바구니\n");		
		System.out.println("상품        가격     수량     총액");
		for(int i=0;i<=n;i++) {				// 지금까지 구매목록을 출력하기 위한 for문
			System.out.println(product[i]+"     "+priceNum[i][m]+"    "+priceNum[i][m+1]+"      "+priceNum[i][m]*priceNum[i][m+1]); // 상품의 이름과 가격, 수량, 금액을 출력
		}
	}
	
	public void finalprint() {		// finalprint 메소드의 머리부
		System.out.println("결제하세요.");
		System.out.println("총 결제금액: "+ it.getproPrice());		// 총 결제금액과 it이 가리키는 Item객체의 getproPrice 메소드를 호출
	}
	 
	
}
