/* 이 프로그램은 쇼핑카트에 물건을 담고 가격과 갯수를 파악해 금액을 출력해주는 프로그램이다. */
import java.util.*;			// util 패키지의 클래스를 선언해줌

public class CarDriver {	// CarDriver 클래스의 머리부
	public static void main(String []args) {	// main 메소드의 머리부
		Scanner scan = new Scanner(System.in);	// Scanner 객체를 생성하고 scan이 그 객체를 가리키게 함
		String YN = "예";						// YN변수를 선언하고 "예"로 초기화
		ShoppingCart cart = new ShoppingCart();	// ShoppingCart 클래스를 가리키는 참조변수 test
		int Capacity = cart.cartSize;			// 장바구니 용량을 선언하고 ShoppingCart 클래스의 cartSize 변수로 지정
		int n= 0;			// ShoppingCart 클래스에서 배열의 행을 지정하는 변수
		int m = 0;			// ShoppingCart 클래스에서 배열의 열을 지정하는 변수
		
		while (YN.equals("예")) {	// YN이 "예"라면 무한으로 반복
			cart.Cart(n,m);		// cart가 가리키는 ShoppingCart객체의 Cart 메소드를 호출
			cart.print(n,m);	// cart가 가리키는 ShoppingCart객체의 print 메소드를 호출
			System.out.println("쇼핑을 계속하기겠습니까?(예 혹은 아니오) :");	
			YN = scan.nextLine();	// YN에 예 or 아니오를 입력받음
			if(YN.equals("예")) {	// YN이 "예"일때
				if((n+1) >= Capacity) {		// n+1가 장바구니 용량보다 크거나 같다면(n+1인 이유는 크기를 [5]라 선언하면 [0]~[4]까지 이기때문)
					System.out.println("장바구니가 가득찼습니다.");
					break;			// 반복문을 탈출한다
				}
				n++;	// 장바구니 5칸중 한개의 칸이 찼으니 다음칸에 입력받기 위해 +1		
			}
		}
		cart.finalprint();	// cart가 가리키는 ShoppingCart객체의 finalprint 메소드를 호출
		}
	}

