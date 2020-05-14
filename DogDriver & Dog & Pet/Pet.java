import java.util.*;		// util 패키지의 클래스를 선언해줌

public class Pet {		// Pet클래스의 머리부
	String name;	// 이름을 받는 변수
	int age;		// 나이를 받는 변수

	public Pet(String Name,int Age) {	// Pet클래스의 생성자의 머리부
		name = Name;		// 이름을 매개변수 Name으로 저장
		age = Age;			// 나이를 매개변수 Age로 저장
	}

	public String getName() {	// getName메소드의 머리부
		return name;		// name을 반환
	}

	public void setName(String name) {		// setName메소드의 머리부
		this.name = name;		// 클래스 변수 name을 매개변수 name으로 저장
	}

	public int getAge() {		// getAge메소드의 머리부
		return age;			// age를 반환
	}	

	public void setAge(int age) {		// setAge메소드의 머리부
		this.age = age;		// 클래스 변수 age를 매개변수 age로 저장
	}
	
	public String petTotal() {		// petTotal메소드의 머리부
		return "이름: "+name+"  나이: "+age;		// "이름: "+name+"  나이: "+age을 반환
	}
	
	public void print() {		// print메소드의 머리부
		System.out.println("이름: "+name);	// "이름: "+name 을 출력
		System.out.println("나이: "+age);		// "나이: "+age 을 출력
	}
}
