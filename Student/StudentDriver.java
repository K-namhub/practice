/* 이 프로그램은 학생의 이름을 받고 과제 점수, 시험점수를 입력받아 합산해 총점과 학점을 알려주는 프로그램이다. */
public class StudentDriver{    // 클래스의 머리부
	
	public static void main(String [] args) {// main 메소드의 머리부
		Student stu1 = new Student();        // Student 객체를 생성하고 참조변수 stu1이 그 객체를 가리키게 함
		Student stu2 = new Student();		 // Student 객체를 생성하고 참조변수 stu2가 그 객체를 가리키게 함
		
		stu1.setStuName("선남");		// stu1이 가리키는 Student 객체의 setStuName 메소드를 호출
		stu1.inputGrades(); 	// stu1이 가리키는 Student 객체의 inputGrades 메소드를 호출
		stu1.print();			// stu1이 가리키는 Student 객체의 print 메소드를 호출
		
		stu2.setStuName("선녀");		// stu2이 가리키는 Student 객체의 setStuName 메소드를 호출
		stu2.inputGrades();		// stu2가 가리키는 Student 객체의 inputGrades 메소드를 호출
		stu2.print();			// stu2가 가리키는 Student 객체의 print 메소드를 호출
		
	}
	
}