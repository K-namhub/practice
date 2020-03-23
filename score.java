/*이 프로그램은 프로그래밍과 이산수학 과목의 점수를 받아 평균값을 계산해주는 프로그램입니다.*/

package score;
import java.util.Scanner;                           // 과목의 점수를 입력 받기위해 util 패키지의 Scanner클래스를 선언해줍니다.

public class score {                                //점수를 받고 출력하기위한 클래스 머리부.

	public static void main(String [] args) {       //main 메소드 머리부.
		double program_sc;                          //프로그래밍 과목의 점수를 받기위한 변수.
		double math_sc;                             //이산수학 과목의 점수를 받기위한 변수.
		double sum;							        //두 과목의 점수의 합을 받기위한 변수.
		double avg ;								//두 과목의 평균값을 받기위한 변수.	
		
		
		Scanner scan = new Scanner(System.in);             	     //Scanner 객체를 생성하고 scan이 그 객체를 가리키게 해줍니다.
		System.out.print("프로그래밍 과목의 점수를 입력하세요:");   	     //화면에 "프로그래밍 과목의 점수를 입력하세요:" 를 출력해줍니다.
		program_sc = scan.nextDouble();							 //만들어준 프로그래밍 과목 변수에 입력한 값을 할당해줍니다.
		System.out.print("이산수학 과목의 점수를 입력하세요:");	 	     //화면에 "이산수학 과목의 점수를 입력하세요:" 를 출력해줍니다.
		math_sc = scan.nextDouble();							 //만들어준 이산수학 과목 변수에 입력한 값을 할당해줍니다.
		sum = program_sc + math_sc;							     //sum 변수에 입력 두 과목의 점수의 합을 저장해줍니다.
		avg = sum/2;										     //평균의 값은 '합/과목의 수' 이기 때문에 avg변수에 평균값을 계산하여 저장해줍니다.
		System.out.println("평균점수:"+avg);				  	 	 // 계산한 평균의 값을 출력하여 줍니다.
		System.out.println("주: 평균 점수" +avg+"는 계산한 값이다.");	 //마지막으로 정리하여 평균의 값을 출력해줍니다.
		
		
	}
	
}
