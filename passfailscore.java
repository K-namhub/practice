/*이 프로그램은 자바 프로그래밍 과목을 수강하는 학생들의 점수들을 읽어 들여 통과 점수(60점 이상)를 받은 학생들의 수와 낙제 점수(60점 미만)를 받은 학생들의 수를 계산하여 출력하는 프로그램이다.*/

package passfailscore;

import java.util.Scanner;         //학생들의 점수를 받기위한 util 패키지의 Scanner 클래스를 선언해준다.

public class passfailscore {	 // 클래스의 머리부
	
	
	public static void main(String [] args) {   // 메소드의 머리부
		int p_stu = 0;			// 통과 학생들의 수를 저장한 변수(아직 학생들의 점수를 받지않아서 0으로 저장)		
		int f_stu = 0;			// 낙제 학생들의 수를 저장한 변수(아직 학생들의 점수를 받지않아서 0으로 저장)		
		int total_stu = 0;		// 통과 학생들과 낙제 학생들을 더한 수(총 학생수)(아직 학생들의 점수를 받지않아서 0으로 저장)		
		int score = 1;			// 학생들의 점수(반복문에 들어가기 위해서 임의의 양수인 1로 지정해주었다.)
		
		Scanner scan = new Scanner(System.in);			// Scanner 객체를 생성하고 scan이 그 객체를 가리키게 함.
		
		
		System.out.print("첫 번째 점수(종료하려면 음수)를 입력하세요.");	// "첫 번째 점수(종료하려면 음수)를 입력하세요."를 출력
		score = scan.nextInt();				// 점수를 받기 위한 변수 score에 점수를 입력받는다
		
		
		while (score >= 0)	// 점수가 0이상이면 반복문에 들어가게 해주고 score가 0보다 작을때까지 반복
		{
			if(score >= 60) {		// 만약에 score가 60점 이상이면
				p_stu++;			// p_stu(통과 학생들을 저장한 변수)에 1을 더해준다.
			}else if(score >=0 && score < 60) {		// 만약에 score가 0이상 60미만이라면
				f_stu++;			//f_stu(낙제 학생들을 저장한 변수)에 1을 더해준다.
			}
			
			System.out.print("다음 점수(종료하려면 음수)를 입력하세요.");	// "다음 점수(종료하려면 음수)를 입력하세요."를 출력
			score = scan.nextInt();		// 점수를 받기 위한 변수 score에 점수를 입력받는다
				
	
	      }
		
		
		total_stu = p_stu + f_stu; 					// p_stu(통과 학생들의 수) + f_stu(낙제 학생들의 수) 의 합을 total_stu(전체 학생들의 수)에 저장
		
		System.out.println("학생들의 수 :"+total_stu);		// "학생들의 수 :" total_stu 를 출력
		System.out.println("통과 학생들의 수 :"+ p_stu);		// "통과 학생들의 수 :"p_stu 를 출력
		System.out.println("낙제 학생들의 수 :"+ f_stu);		// "낙제 학생들의 수 :" f_stu 를 출력
		 
	}

}


