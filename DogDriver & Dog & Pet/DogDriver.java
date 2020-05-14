/* 이 프로그램은 개의 이름,나이,품종,예방접종 여부를 받아 출력해주는 프로그램이다. */
import java.util.*;		// util 패키지의 클래스를 선언해줌

public class DogDriver {	// DogDriver클래스의 머리부
	public static void main(String []args) {	// main메소드의 머리부
		String name;		// 이름을 받는 변수
		String YN;			// 예, 아니오를 받는 변수
		String dogbreed;	// 품종을 받기 위한 변수
		int age;			// 나이를 받기 위한 변수

		Dog n = new Dog("하루",3,"진돗개",true);		// Dog클래스를 가리키는 참조변수  n (값을 초기화해줌)
		Scanner scan = new Scanner(System.in);		// Scanner 객체를 생성하고 scan이 그 객체를 가리키게 함
		System.out.println("개의 이름을 입력하세요.: ");	
		name = scan.nextLine();						// name에 입력받은 값을 저장
		System.out.println("개의 나이를 입력하세요.: ");
		age = scan.nextInt();						// age에 입력받은 값을 저장
		scan.nextLine();							// nextInt() 다음 nextLine()을 받아주기 위해 선언(이 선언이 없으면 받을 수 없음)
		System.out.println("개의 품종을 입력하세요.: ");	
		dogbreed = scan.nextLine();					// dogbreed에 입력받은 값을 저장
		System.out.println("예방주사를 맞았나요(예 혹은 아니오)?: ");
		YN = scan.nextLine();						// YN에 입력받은 값을 저장
		n.print();									// n이 가리키는 Dog클래스의 print메소드를 호출
		
		if(YN.equals("예")) {		// YN이 예라면
			n= new Dog(name,age,dogbreed,true);		// n이 가리키는 Dog클래스에 새로운 값을 저장
			n.print();								// n이 가리키는 Dog클래스의 print메소드를 호출 
		}else {			// 아니면								
			n= new Dog(name,age,dogbreed,false);	// n이 가리키는 Dog클래스에 새로운 값을 저장
			n.print();								// n이 가리키는 Dog클래스의 print메소드를 호출 
			if(n.age >2) {		// n이 가리키는 Dog클래스의 age변수가 2보다 크다면
				System.out.println("다음 개들은 두살이 넘었으나 예방주사를 맞지 않았다. :");
				System.out.println(n.petTotal());		// n이 가리키는 Dog클래스의 petTotal클래스를 출력
			}
		}		
	}
}
