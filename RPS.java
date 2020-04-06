/*이 프로그램은 선수1과 선수2가 가위-바위-보를 하여 승부의 결과를 알려주는 프로그램입니다.*/


import java.util.Scanner;    // 가위 바위 보를 입력받기 위한 util 패키지의 Scanner 클래스를 선언해준다.

public class RPS {			// 클래스의 머리부
	
	public static void main(String [] args) {		// 메소드의 머리부
		
		String player1;		// 선수 1의 패를 입력받기 위한 변수
		String player2;		// 선수 2의 패를 입력받기 위한 변수
		
		Scanner scan = new Scanner(System.in);		// Scanner객체를 생성하고 scan이 그 객체를 가리키게 함
		
		
		while(true)			// 반복문을 무한으로 돌려준다.
		{
			
			System.out.println("선수 1(가위, 바위 혹은 보 중 선택): ");  // "선수 1(가위, 바위 혹은 보 중 선택): "를 출력
			player1 = scan.nextLine();							// player1에 가위, 바위, 보 중 하나를 입력받는다.
			System.out.println("선수 2(가위, 바위 혹은 보 중 선택): ");	// "선수 1(가위, 바위 혹은 보 중 선택): "를 출력		
			player2 = scan.nextLine();							// player2에 가위, 바위, 보 중 하나를 입력받는다.
			
				
			if(player1.equals("가위")) {     						// player1이 가위와 같을 때
				if(player2.equals("가위")) {						// player2가 가위와 같다면
					System.out.println("비겼다 !");				// "비겼다 !"를 출력
				}else if(player2.equals("바위")) {				// player2가 바위와 같다면
					System.out.println("선수 2가 이겼다 !"); 		// "선수 2가 이겼다 !"를 출력
					break;										// 승부가 났기 때문에 반복문을 탈출한다.
				}else if(player2.equals("보")) {					// player2가 보와 같다면
					System.out.println("선수 1이 이겼다 !");			// "선수 1이 이겼다 !"를 출력
					break;										// 승부가 났기 때문에 반복문을 탈출한다.
				}
			}
		
			if(player1.equals("보")) {							// player1이 보와 같을 때
				if(player2.equals("보")) {						// player2가 보와 같다면
					System.out.println("비겼다 !");				// "비겼다 !"를 출력
				}else if(player2.equals("가위")) {				// player2가 가위와 같다면
					System.out.println("선수 2가 이겼다 !");			// "선수 2가 이겼다 !"를 출력
					break;										// 승부가 났기 때문에 반복문을 탈출한다.
				}else if(player2.equals("바위")) {				// player2가 바위와 같다면
					System.out.println("선수 1이 이겼다 !");			// "선수 1이 이겼다 !"를 출력
					break;										// 승부가 났기 때문에 반복문을 탈출한다.
				}
			}
		
			if(player1.equals("바위")) {							// player1이 바위와 같을 때
				if(player2.equals("바위")) {						// player2가 바위와 같다면
					System.out.println("비겼다 !");				// "비겼다 !"를 출력
				}else if(player2.equals("보")) {					// player2가 보와 같다면
					System.out.println("선수 2가 이겼다 !");			// "선수 2가 이겼다 !"를 출력
					break;										// 승부가 났기 때문에 반복문을 탈출한다.
				}else if(player2.equals("가위")) {				// player2가 가위와 같다면
					System.out.println("선수 1이 이겼다 !");			// "선수 1이 이겼다 !"를 출력
					break;										// 승부가 났기 때문에 반복문을 탈출한다.
				}				
			}
		}

	}
}
