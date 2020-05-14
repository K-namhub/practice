public class Dog extends Pet {		// Pet클래스까지 확장한 Dog클래스의 머리부
	String DogBreed;		// 품종을 받는 변수
	boolean Vaccination;	// 백신여부를 받는 변수
	 
	public Dog(String name,int age,String DB,boolean Vc) {		// Dog클래스의 생성자의 머리부
		super(name,age);		// 부모클래스에 값을 저장
		DogBreed = DB;			// 품종을 매개변수 DB로 저장
		Vaccination = Vc;		// 백신여부를 매개변수 Vc로 저장
	}

	public String getDogBreed() {	// getDogBreed메소드의 머리부
		return DogBreed;		// DogBreed를 반환
	}	

	public void setDogBreed(String DogBreed) {		// setDogBreed메소드의 머리부
		this.DogBreed = DogBreed;	// 클래스 변수 Dogbreed를 매개변수 DogBreed로 저장
	}

	public boolean isVaccination() {	// isVaccination메소드의 머리부
		return Vaccination;		// Vaccination을 반환
	}

	public void setVaccination(boolean Vaccination) {		// setVaccination메소드의 머리부
		this.Vaccination = Vaccination;		// 클래스 변수 Vaccination을 매개변수 Vaccination으로 저장
	}
	
	public void print() {	// print 메소드의 머리부 (오버라이딩)
		super.print();		// 부모클래스에서 print메소드를 호출
		System.out.println("품종: "+ DogBreed);		// "품종: "+ DogBreed을 출력
		if (Vaccination == true) {		// 접종여부가 true 라면
			System.out.println("예방주사를 맞았다.\n");		// 예방주사를 맞았다. 출력
		}else {		// 아니라면
			System.out.println("예방주사를 맞지 않았었다.\n");		//예방주사를 맞지 않았었다. 출력
		}
	} 
}	
