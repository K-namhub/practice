public class Dog extends Pet {		// PetŬ�������� Ȯ���� DogŬ������ �Ӹ���
	String DogBreed;		// ǰ���� �޴� ����
	boolean Vaccination;	// ��ſ��θ� �޴� ����
	 
	public Dog(String name,int age,String DB,boolean Vc) {		// DogŬ������ �������� �Ӹ���
		super(name,age);		// �θ�Ŭ������ ���� ����
		DogBreed = DB;			// ǰ���� �Ű����� DB�� ����
		Vaccination = Vc;		// ��ſ��θ� �Ű����� Vc�� ����
	}

	public String getDogBreed() {	// getDogBreed�޼ҵ��� �Ӹ���
		return DogBreed;		// DogBreed�� ��ȯ
	}	

	public void setDogBreed(String DogBreed) {		// setDogBreed�޼ҵ��� �Ӹ���
		this.DogBreed = DogBreed;	// Ŭ���� ���� Dogbreed�� �Ű����� DogBreed�� ����
	}

	public boolean isVaccination() {	// isVaccination�޼ҵ��� �Ӹ���
		return Vaccination;		// Vaccination�� ��ȯ
	}

	public void setVaccination(boolean Vaccination) {		// setVaccination�޼ҵ��� �Ӹ���
		this.Vaccination = Vaccination;		// Ŭ���� ���� Vaccination�� �Ű����� Vaccination���� ����
	}
	
	public void print() {	// print �޼ҵ��� �Ӹ��� (�������̵�)
		super.print();		// �θ�Ŭ�������� print�޼ҵ带 ȣ��
		System.out.println("ǰ��: "+ DogBreed);		// "ǰ��: "+ DogBreed�� ���
		if (Vaccination == true) {		// �������ΰ� true ���
			System.out.println("�����ֻ縦 �¾Ҵ�.\n");		// �����ֻ縦 �¾Ҵ�. ���
		}else {		// �ƴ϶��
			System.out.println("�����ֻ縦 ���� �ʾҾ���.\n");		//�����ֻ縦 ���� �ʾҾ���. ���
		}
	} 
}	
