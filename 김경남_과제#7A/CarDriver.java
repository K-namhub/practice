/* �� ���α׷��� �ڵ����� ���� ��ũ �뷮, ���� ���� ��, �ִ� �ӵ�, ���� �ӵ�, ����� ���� �Ÿ��� �޾� ����ϴ� ���α׷��̴�. */

public class CarDriver {	// Ŭ������ �Ӹ���
	public static void main(String [] args) {	// main �޼ҵ��� �Ӹ���
		Car bmw = new Car(100, 120,20);			// Car��ü�� �����ϰ�  �������� bmw�� �� ��ü�� ����Ű�� �Ѵ�. 
		
		bmw.fuelCharge(10);						// bmw�� ����Ű�� Car��ü�� fuelCharge �޼ҵ带 ȣ���Ѵ�.
		bmw.print();							// bmw�� ����Ű�� Car��ü�� print�޼ҵ带 ȣ���Ѵ�.
		bmw.speedCheck(bmw.changeSpeed(150));	// bmw�� ����Ű�� Car��ü�� speedCheck �޼ҵ带 ȣ���Ѵ�.
		bmw.print();							// bmw�� ����Ű�� Car��ü�� print �޼ҵ带 ȣ���Ѵ�.
		bmw.operateForTime(1);					// bmw�� ����Ű�� Car��ü�� operateForTime �޼ҵ带 ȣ���Ѵ�.
		bmw.print();							// bmw�� ����Ű�� Car��ü�� print �޼ҵ带 ȣ���Ѵ�.
		bmw.speedCheck(bmw.changeSpeed(80));	// bmw�� ����Ű�� Car��ü�� speedCheck �޼ҵ带 ȣ���Ѵ�.
		bmw.operateForTime(2);					// bmw�� ����Ű�� Car��ü�� operateForTime �޼ҵ带 ȣ���Ѵ�.
		bmw.print();							// bmw�� ����Ű�� Car��ü�� print �޼ҵ带 ȣ���Ѵ�.
	}

}
