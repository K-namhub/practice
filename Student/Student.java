import java.util.*;   // util 패키지의 클래스를 선언해줌

public class Student {  // Student 클래스의 머리부
   String StuName;		// 학생 이름을 받기 위한 변수
   int HomeGrade;		// 과제 점수를 받기 위한 변수
   int TestGrade;		// 시험 점수를 받기 위한 변수
   
   
   public void setStuName(String name) { // 학생 이름을 받는 메소드의 머리부
      StuName = name;				// 입력받은 이름을 StuName에 저장
   }   
   
   public void setHomework(int Hscore) {	// 과제 점수를 받는 메소드의 머리부
	  Scanner scan = new Scanner(System.in); 		// Scanner 객체를 생성하고 scan이 그 객체를 가리키게 함
	  HomeGrade = Hscore;							// 매개변수 Hscore를 HomeGrade에 저장
      while(true) {								// 반복문을 무한으로 돌린다
         if(HomeGrade < 0 || HomeGrade > 100) {			// HomeGrade의 값이 0보다 작거나 100보다 크다면
            System.out.println("과제 점수가 0보다 작거나 100보다 크다.");		// "과제 점수가 0보다 작거나 100보다 크다." 출력
            System.out.println(getStuName() + "의 과제점수를 다시 입력하라.");	    // StuName"의 과제점수를 다시 입력하라." 출력 후 다시 입력 받음
            HomeGrade = scan.nextInt();					// HomeGrade에 입력값을 저장
         }else {										// HomeGrade의 값이 0과 100사이라면
            break;										// 반복문을 탈출한다
         }
      }
   }
   
   public void setTest(int Tscore) {		// 시험 점수를 받는 메소드의 머리부
	  Scanner scan = new Scanner(System.in); 		// Scanner 객체를 생성하고 scan이 그 객체를 가리키게 함
	  TestGrade = Tscore;					// 매겨변수 Tscore를 TestGrade에 저장
	  while(true) {								// 반복문을 무한으로 돌린다
         if(TestGrade < 0 || TestGrade >100) {			// TestGrade의 값이 0보다 작거나 100보다 크다면
		   System.out.println("시험 점수가 0보다 작거나 100보다 크다.");		// "시험 점수가 0보다 작거나 100보다 크다." 출력
		   System.out.println(getStuName() + "의 시험점수를 다시 입력하라.");	// StuName"의 시험점수를 다시 입력하라." 출력 후 다시 입력 받음
		   TestGrade = scan.nextInt();					// HomeGrade에 입력값을 저장
		  }else {										// TestGrade의 값이 0과 100사이라면
			  break;										// 반복문을 탈출한다
		  }   
	  }   
   }

   public void inputGrades(){	// 학생의 이름, 과제 점수, 시험점수를 받는 메소드의 머리부
	  Scanner scan = new Scanner(System.in);	// Scanner 객체를 생성하고 scan이 그 객체를 가리키게 함
	  System.out.println(getStuName() + "의 과제점수를 입력하라.");	// StuName"의 과제점수를 입력하라." 출력
      setHomework(scan.nextInt());		// setHomework 메소드를 호출
      System.out.println(getStuName() + "의 시험점수를 입력하라.");	// StuName"의 시험점수를 입력하라." 출력
      setTest(scan.nextInt());			// setTest 메소드를 호출
   }
   
   public double getTotal() {		// 과제와 시험 점수의 총점수를 계산 하는 메소드의 머리부
      return getHomework()*0.4 + getTest()*0.6;		// 시험 반영 점수맞게 계산하여 반환해줌
   }
   
   public String getGrade(double total){	// 학점을 계산하는 메소드의 머리부
      String totalGrade;	// 학점을 받는 변수
      if(total >= 90) {		// 총점이 90점 이상이면
         totalGrade = "A";					// 학점은 A이다
      }else if(total < 90 && total >= 80) {	// 총점이 90점 미만 80점 이상이면
         totalGrade = "B";					// 학점은 B이다
      }else if(total < 80 && total >= 70) {	// 총점이 80점 미만 70점 이상이면
         totalGrade = "C";					// 학점은 C이다 
      }else if(total < 70 && total >= 60) {	// 총점이 70점 미만 60점 이상이면
         totalGrade = "D";					// 학점은 D이다
      }else {								// 그 이하 점수들이라면
         totalGrade = "F";					// 학점은 F이다
      }
      return totalGrade;					// 학점을 반환
   }
   
   public String getStuName() {		// 학생이름을 반환해주는 메소드의 머리부
      return StuName;				// 학생이름을 반환해줌
   }
   
   public int getHomework() {		// 과제점수를 반환해주는 메소드의 머리부
      return HomeGrade;				// 과제점수를 반환해줌
   }
   
   public int getTest() {			// 시험점수를 반환해주는 메소드의 머리부
      return TestGrade;				// 시험점수를 반환해줌
   }
   
   public void print() {			// 총 결과를 출력해주는 메소드의 머리부
         System.out.println(getStuName() + "의 총점은" + getTotal() + "이고 학점은 " + getGrade(getTotal()) + "이다."); // StuName "의 총점은"getTotal()"이고 학점은 "getGrade(getTotal())"이다." 출력해줌
   }
}
