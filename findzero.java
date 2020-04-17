/*이 프로그램은 재귀메소드와 반복메소드를 이용하여 양의 정수 내에 있는 숫자 0의 개수를 구하는 프로그램입니다.*/
package findzero;

import java.util.Scanner;		// 양의 정수를 받기 위해 util 패키지 Scanner 클래스를 선언해줌

public class findzero {			// 양의 정수를 받고 0의 갯수를 출력해주기 위한 클래스의 머리부
	
	public static void main(String [] args) {	// main 메소드의 머리부
		int num;								// 양의 정수 변수
		System.out.print("양의 정수를 입력하세요 : ");		// "양의 정수를 입력하세요 : "를 출력
		Scanner scan = new Scanner(System.in);		// Scanner 객체를 생성하고 scan이 그 객체를 가리키게 함
		num = scan.nextInt();					// 양의 정수를 입력받고 num 변수에 입력한 값을 할당해줌
		repeat(num);							// 반복 메소드를 호출
		System.out.println("재귀 결과 : "+recursion(num) + "개");	// "재귀 결과 : "+recursion(num) + "개"를 출력
	}
	
	static void repeat(int num) {	// 반복 메소드의 머리부(매개 변수로 num을 받아줌)
		int count = 0;				// 0의 개수를 카운트해주기 위한 변수( = 0 을 써서 초기화 해줌)
		while(num >= 10)			// 양의정수가 10이상이면 계속 반복해줌
		{
			if(num % 10 == 0) {		// 양의 정수를 10으로 나눴을 때 나머지가 0이라면
				count++;			// count변수에 1을 더해줌
				num = num / 10;		// 양의 정수를 10으로 나누어줘서 끝자리를 제거하고 다음 0을 찾아줌
			}else {					// 양의 정수를 10으로 나눴을 때 나머지가 0이 아니라면
				num = num / 10;		// 양의 정수를 10으로 나누어줘서 끝자리를 제거하고 다음 0을 찾아줌
			}
		}
		System.out.println("반복 결과 : "+count+ "개");   //"반복 결과 : "+count+ "개" 를 출력
	}	
		
	static int recursion(int num){	// 재귀 메소드의 머리부(매개 변수로 num을 받아줌)
		if(num < 10) {				// 양의 정수가 10보다 작을때
			return 0;				// 0으로 리턴해줌
		}else {						// 양의 정수가 10보다 클때
			if(num % 10 == 0) {		// 양의 정수를 10으로 나누어서 나머지가 0이라면
				return recursion(num /10)+1;	// 양의 정수를 10으로 나눠주면서 끝자리를 제거하고 1을 더해줌(카운트 역할)
			}else {					// 양의 정수를 10으로 나누어서 나머지가 0이 아니라면
				return recursion(num / 10);		// 양의 정수를 10으로 나눠주면서 끝자리를 제거함
			}
		}	
	}			
}
