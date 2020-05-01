import java.util.*;		// util 패키지의 클래스를 선언해줌

public class Car {		// Car클래스의 머리부
	double fuelCapacity;	// 연료 탱크 용량
	double currentFuel = 0;	// 현재 연료 용량 (0으로 초기화)
	double Mspeed;			// 최대 속도
	double Cspeed = 0;		// 현재 속도 (0으로 초기화)
	double distance = 0;	// 주행 거리 (0으로 초기화)
	double fuelEff;			// 연비
	
	public Car(double fc, double ms, double fe) { // Car 클래스의 생성자의 머리부
		fuelCapacity = fc;	// 연료 탱크 용량을 매개변수 fc로 받아줌
		Mspeed = ms;		// 최대 속도를 매개변수 ms로 받아줌
		fuelEff = fe;		// 연비를 매개변수 fe로 받아줌
	}
	
	public double changeSpeed(double speed) {	// changeSpeed 메소드의 머리부
		Cspeed = speed;	// 현재속도를 매개변수 speed로 받아줌
		return Cspeed;	// 현재속도를 반환
	}
	
	public void speedCheck(double speed) {	// speedCheck 메소드의 머리부
		System.out.println("속도를 "+ Cspeed + "으로 변경시도");
		if ( Cspeed > Mspeed) {		// 현재속도가 최대속도보다 크다면
			System.out.println("최대속도인 "+ Mspeed + "으로 변경해야 한다.");
			Cspeed = Mspeed;	// 현재속도를 최대속도로 바꿔줌
		}else if (Cspeed < 0) {	// 현재속도가 0보다 작다면
			System.out.println("최저속도는 0으로 변경된다.");
			Cspeed = 0;		// 현재속도를 0으로 바꿔줌
		}
	}
	
	public void fuelCharge(int charge) {	// fuelCharge 메소드의 머리부
		System.out.println(charge + " 리터 주유");
		if(charge + currentFuel > fuelCapacity) {	// 현재 연료량과 주유량의 합이 연료탱크용량보다 많다면
			currentFuel = fuelCapacity;		//현재 연료량을 연료탱크용량으로 바꿔줌
		}else {	// 현재 연료량과 주유량의 합이 연료탱크용량보다 적다면
			currentFuel = currentFuel + charge;	// 현재연료량은 이전연료량 + 주유량
		}
	}
	
	public void operateForTime(int time) {	// operateForTime 메소드의 머리부
		double availableT = currentFuel * fuelEff / Cspeed;	// 현재 연료량*연비/현재속도 = 가능한 운행시간
		double Want_fuel = Cspeed * time / fuelEff;			// 현재속도로 ?시간 동안 운행하려면 필요한 연료량
		operateFordistance(availableT,Want_fuel,time);		// operateFordistance 메소드를 호출
	}
	
	public void operateFordistance(double availableT,double Want_fuel,int time) {	// operateFordistance 메소드의 머리부
		  double Dplus = Cspeed*time;	// 현재속도*시간 = 주행거리
	   
	      System.out.println("속도 " + Cspeed + "으로 " + time + "시간동안 운행하려고 한다.");
	      if(currentFuel < Want_fuel) {	// 현재연료량이 운행에 필요한 연료량보다 적다면
	         System.out.println("연료가 모자란다.");
	         System.out.println("가능한 운행 시간 = " + availableT);
	         distance = distance + currentFuel * fuelEff;	//주행거리는 지금까지의 주행거리 +남은연료로 갈수있는거리
	         currentFuel = 0;	// 현재연료량 = 0
	      }else {	// 현재연료량이 운행에 필요한 연료량보다 많다면
	         distance = distance + Dplus;	// 주행거리는 지금까지의 주행거리 + 추가로 주행한 거리
	         currentFuel = currentFuel - Want_fuel;	// 현재연료량 = 이전의 연료량 - 주행에 썼던 연료량
	      }
	}
	
	public void print() {	// print 메소드의 머리부
		System.out.println("남은 연료 = " + currentFuel + " 현재 속도 = " + Cspeed +" 주행 거리 = " + distance);	//남은 연료, 현재 속도, 주행 거리를 출력
	}

}
