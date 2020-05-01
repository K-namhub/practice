import java.util.*;		// util ��Ű���� Ŭ������ ��������

public class Car {		// CarŬ������ �Ӹ���
	double fuelCapacity;	// ���� ��ũ �뷮
	double currentFuel = 0;	// ���� ���� �뷮 (0���� �ʱ�ȭ)
	double Mspeed;			// �ִ� �ӵ�
	double Cspeed = 0;		// ���� �ӵ� (0���� �ʱ�ȭ)
	double distance = 0;	// ���� �Ÿ� (0���� �ʱ�ȭ)
	double fuelEff;			// ����
	
	public Car(double fc, double ms, double fe) { // Car Ŭ������ �������� �Ӹ���
		fuelCapacity = fc;	// ���� ��ũ �뷮�� �Ű����� fc�� �޾���
		Mspeed = ms;		// �ִ� �ӵ��� �Ű����� ms�� �޾���
		fuelEff = fe;		// ���� �Ű����� fe�� �޾���
	}
	
	public double changeSpeed(double speed) {	// changeSpeed �޼ҵ��� �Ӹ���
		Cspeed = speed;	// ����ӵ��� �Ű����� speed�� �޾���
		return Cspeed;	// ����ӵ��� ��ȯ
	}
	
	public void speedCheck(double speed) {	// speedCheck �޼ҵ��� �Ӹ���
		System.out.println("�ӵ��� "+ Cspeed + "���� ����õ�");
		if ( Cspeed > Mspeed) {		// ����ӵ��� �ִ�ӵ����� ũ�ٸ�
			System.out.println("�ִ�ӵ��� "+ Mspeed + "���� �����ؾ� �Ѵ�.");
			Cspeed = Mspeed;	// ����ӵ��� �ִ�ӵ��� �ٲ���
		}else if (Cspeed < 0) {	// ����ӵ��� 0���� �۴ٸ�
			System.out.println("�����ӵ��� 0���� ����ȴ�.");
			Cspeed = 0;		// ����ӵ��� 0���� �ٲ���
		}
	}
	
	public void fuelCharge(int charge) {	// fuelCharge �޼ҵ��� �Ӹ���
		System.out.println(charge + " ���� ����");
		if(charge + currentFuel > fuelCapacity) {	// ���� ���ᷮ�� �������� ���� ������ũ�뷮���� ���ٸ�
			currentFuel = fuelCapacity;		//���� ���ᷮ�� ������ũ�뷮���� �ٲ���
		}else {	// ���� ���ᷮ�� �������� ���� ������ũ�뷮���� ���ٸ�
			currentFuel = currentFuel + charge;	// ���翬�ᷮ�� �������ᷮ + ������
		}
	}
	
	public void operateForTime(int time) {	// operateForTime �޼ҵ��� �Ӹ���
		double availableT = currentFuel * fuelEff / Cspeed;	// ���� ���ᷮ*����/����ӵ� = ������ ����ð�
		double Want_fuel = Cspeed * time / fuelEff;			// ����ӵ��� ?�ð� ���� �����Ϸ��� �ʿ��� ���ᷮ
		operateFordistance(availableT,Want_fuel,time);		// operateFordistance �޼ҵ带 ȣ��
	}
	
	public void operateFordistance(double availableT,double Want_fuel,int time) {	// operateFordistance �޼ҵ��� �Ӹ���
		  double Dplus = Cspeed*time;	// ����ӵ�*�ð� = ����Ÿ�
	   
	      System.out.println("�ӵ� " + Cspeed + "���� " + time + "�ð����� �����Ϸ��� �Ѵ�.");
	      if(currentFuel < Want_fuel) {	// ���翬�ᷮ�� ���࿡ �ʿ��� ���ᷮ���� ���ٸ�
	         System.out.println("���ᰡ ���ڶ���.");
	         System.out.println("������ ���� �ð� = " + availableT);
	         distance = distance + currentFuel * fuelEff;	//����Ÿ��� ���ݱ����� ����Ÿ� +��������� �����ִ°Ÿ�
	         currentFuel = 0;	// ���翬�ᷮ = 0
	      }else {	// ���翬�ᷮ�� ���࿡ �ʿ��� ���ᷮ���� ���ٸ�
	         distance = distance + Dplus;	// ����Ÿ��� ���ݱ����� ����Ÿ� + �߰��� ������ �Ÿ�
	         currentFuel = currentFuel - Want_fuel;	// ���翬�ᷮ = ������ ���ᷮ - ���࿡ ��� ���ᷮ
	      }
	}
	
	public void print() {	// print �޼ҵ��� �Ӹ���
		System.out.println("���� ���� = " + currentFuel + " ���� �ӵ� = " + Cspeed +" ���� �Ÿ� = " + distance);	//���� ����, ���� �ӵ�, ���� �Ÿ��� ���
	}

}
