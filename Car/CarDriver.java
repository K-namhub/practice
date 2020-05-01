/* 이 프로그램은 자동차의 연료 탱크 용량, 현재 연료 양, 최대 속도, 현재 속도, 연비와 주행 거리를 받아 출력하는 프로그램이다. */

public class CarDriver {	// 클래스의 머리부
	public static void main(String [] args) {	// main 메소드의 머리부
		Car bmw = new Car(100, 120,20);			// Car객체를 생성하고  참조변수 bmw가 그 객체를 가리키게 한다. 
		
		bmw.fuelCharge(10);						// bmw가 가리키는 Car객체의 fuelCharge 메소드를 호출한다.
		bmw.print();							// bmw가 가리키는 Car객체의 print메소드를 호출한다.
		bmw.speedCheck(bmw.changeSpeed(150));	// bmw가 가리키는 Car객체의 speedCheck 메소드를 호출한다.
		bmw.print();							// bmw가 가리키는 Car객체의 print 메소드를 호출한다.
		bmw.operateForTime(1);					// bmw가 가리키는 Car객체의 operateForTime 메소드를 호출한다.
		bmw.print();							// bmw가 가리키는 Car객체의 print 메소드를 호출한다.
		bmw.speedCheck(bmw.changeSpeed(80));	// bmw가 가리키는 Car객체의 speedCheck 메소드를 호출한다.
		bmw.operateForTime(2);					// bmw가 가리키는 Car객체의 operateForTime 메소드를 호출한다.
		bmw.print();							// bmw가 가리키는 Car객체의 print 메소드를 호출한다.
	}

}
