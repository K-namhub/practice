/*이 프로그램은 원기둥의 반지름과 높이를 1~10사에 정수를 랜덤으로 받아 부피와 표면적을 출력하는 프로그램입니다.*/

package volumearea;
import java.util.Random;                	 //원기둥의 반지름과 높이를 랜덤으로 받기위해 util 패키지의  Random클래스를 선언해줍니다.

public class volumearea {					 //랜덤으로 값을 받고 부피와 표면적을 계산하여 출력해주는 클래스 머리부
	
	public static void main(String[] args) { //main 메소드 머리부
		final double PI = 3.14159;			//PI의 값은 정해져 있기 때문에 3.14159로 미리 정해줌.
		int radius;							//원의 반지름 변수
		int height;							//원기둥의 높이 변수
		double volume;						//원기둥의 부피 변수	
		double area;						//원기둥의 표면적 변수
	
		
		Random ran = new Random();    		                //Random 객체를 생성하고 ran이 그 객체를 가리키게 함.
	
		radius = ran.nextInt(10)+1;							//ran에 0~9까지 10개의 정수를 랜덤으로 값을 주게함. 하지만 radius는 1~10 사이의 정수이기 때문에 +1를 해줌.
		height = ran.nextInt(10)+1;							//ran에 0~9까지 10개의 정수를 랜덤으로 값을 주게함. 하지만 height는 1~10 사이의 정수이기 때문에 +1를 해줌.
		
		volume = PI*radius*radius*height;					//volume 변수에 원기둥의 부피 공식을 대입하여 값을 지정해줌.
		area = 2*PI*radius*height+2*PI*radius*radius;		//area 변수에 원기둥의 표면적 공식을 대입하여 값을 지정해줌.
		
		System.out.println("반지름 = " + radius);				//원의 반지름의 값을 출력
		System.out.println("높이 = " + height);				//원기둥이 높이 값을 출력
		System.out.println("부피 = " + volume);				//원기둥의 부피값을 출력
		System.out.println("표면적 = " + area);				//원기둥의 표면적값을 출력
	}

}
