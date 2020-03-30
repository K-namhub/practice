/*이 프로그램은 회사의 입사 지원 대상자 여부를 지원자의 평점과 TOEIC 점수에 따라 결정하여 출력하는 프로그램이다.*/

package company;

import java.util.Scanner;            // 입사 지원자들의 평점과 TOEIC 점수를 받아내기 위한 util 패키지의 Scanner 클래스를 선언해줍니다.

public class company {								// 클래스의 머리부
	public static void main(String [] args) { 		// 메소드의 머리부
		double grade;		// 평점을 저장할 변수									
		int t_sc;			// TOEIC 점수를 저장할 변수
		
		Scanner scan = new Scanner(System.in);   		// Scanner 객체를 생성하고 scan이 그 객체를 가리키게 함.
		
		
		System.out.print("평점을 입력하세요.");				// "평점을 입력하세요"를 출력
		grade = scan.nextDouble();						// grade 변수에 입력한 평점을 저장한다.
		System.out.print("TOEIC 점수를 입력하세요.");		// "TOEIC 점수를 입력하세요."를 출력
		t_sc = scan.nextInt();							// t_sc 변수에 입력한 토익점수를 저장한다.
		
		if(4.0 <= grade && 700 <= t_sc) {  						// 만약에 grade(평점)이 4.0 이상이고 t_sc(토익점수)가 700점 이상이면
			System.out.println("면접 대상자입니다.");				// "면접 대상자입니다."를 출력한다.
		}
		else if(3.5 <= grade && 4.0 > grade && 700 <= t_sc) {	// 만약에 grade(평점)이 3.5 이상 4.0 미만이고 t_sc(토익점수)가 700점 이상이면
			System.out.println("서류 전형 대상자입니다.");				// "서류 전형 대상자입니다."를 출력
		}
		else if(3.0 <= grade && 3.5 > grade && 700 <= t_sc) {	// 만약에 grade(평점)이 3.0 이상 3.5 미만이고 t_sc(토익점수)가 700점 이상이면
			System.out.println("필기 시험 대상자입니다.");				// "필기 시험 대상자입니다."를 출력
		}
		else if(3.0 > grade || 700 > t_sc) {					// 만약에 grade(평점)이 3.0 미만이거나 t_sc(토익점수)가 700점 미만이면	
			System.out.println("지원할 수 없습니다.");				// "지원할 수 없습니다."를 출력
		}
	}
}
