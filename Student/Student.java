import java.util.*;   // util ��Ű���� Ŭ������ ��������

public class Student {  // Student Ŭ������ �Ӹ���
   String StuName;		// �л� �̸��� �ޱ� ���� ����
   int HomeGrade;		// ���� ������ �ޱ� ���� ����
   int TestGrade;		// ���� ������ �ޱ� ���� ����
   
   
   public void setStuName(String name) { // �л� �̸��� �޴� �޼ҵ��� �Ӹ���
      StuName = name;				// �Է¹��� �̸��� StuName�� ����
   }   
   
   public void setHomework(int Hscore) {	// ���� ������ �޴� �޼ҵ��� �Ӹ���
	  Scanner scan = new Scanner(System.in); 		// Scanner ��ü�� �����ϰ� scan�� �� ��ü�� ����Ű�� ��
	  HomeGrade = Hscore;							// �Ű����� Hscore�� HomeGrade�� ����
      while(true) {								// �ݺ����� �������� ������
         if(HomeGrade < 0 || HomeGrade > 100) {			// HomeGrade�� ���� 0���� �۰ų� 100���� ũ�ٸ�
            System.out.println("���� ������ 0���� �۰ų� 100���� ũ��.");		// "���� ������ 0���� �۰ų� 100���� ũ��." ���
            System.out.println(getStuName() + "�� ���������� �ٽ� �Է��϶�.");	    // StuName"�� ���������� �ٽ� �Է��϶�." ��� �� �ٽ� �Է� ����
            HomeGrade = scan.nextInt();					// HomeGrade�� �Է°��� ����
         }else {										// HomeGrade�� ���� 0�� 100���̶��
            break;										// �ݺ����� Ż���Ѵ�
         }
      }
   }
   
   public void setTest(int Tscore) {		// ���� ������ �޴� �޼ҵ��� �Ӹ���
	  Scanner scan = new Scanner(System.in); 		// Scanner ��ü�� �����ϰ� scan�� �� ��ü�� ����Ű�� ��
	  TestGrade = Tscore;					// �Űܺ��� Tscore�� TestGrade�� ����
	  while(true) {								// �ݺ����� �������� ������
         if(TestGrade < 0 || TestGrade >100) {			// TestGrade�� ���� 0���� �۰ų� 100���� ũ�ٸ�
		   System.out.println("���� ������ 0���� �۰ų� 100���� ũ��.");		// "���� ������ 0���� �۰ų� 100���� ũ��." ���
		   System.out.println(getStuName() + "�� ���������� �ٽ� �Է��϶�.");	// StuName"�� ���������� �ٽ� �Է��϶�." ��� �� �ٽ� �Է� ����
		   TestGrade = scan.nextInt();					// HomeGrade�� �Է°��� ����
		  }else {										// TestGrade�� ���� 0�� 100���̶��
			  break;										// �ݺ����� Ż���Ѵ�
		  }   
	  }   
   }

   public void inputGrades(){	// �л��� �̸�, ���� ����, ���������� �޴� �޼ҵ��� �Ӹ���
	  Scanner scan = new Scanner(System.in);	// Scanner ��ü�� �����ϰ� scan�� �� ��ü�� ����Ű�� ��
	  System.out.println(getStuName() + "�� ���������� �Է��϶�.");	// StuName"�� ���������� �Է��϶�." ���
      setHomework(scan.nextInt());		// setHomework �޼ҵ带 ȣ��
      System.out.println(getStuName() + "�� ���������� �Է��϶�.");	// StuName"�� ���������� �Է��϶�." ���
      setTest(scan.nextInt());			// setTest �޼ҵ带 ȣ��
   }
   
   public double getTotal() {		// ������ ���� ������ �������� ��� �ϴ� �޼ҵ��� �Ӹ���
      return getHomework()*0.4 + getTest()*0.6;		// ���� �ݿ� �����°� ����Ͽ� ��ȯ����
   }
   
   public String getGrade(double total){	// ������ ����ϴ� �޼ҵ��� �Ӹ���
      String totalGrade;	// ������ �޴� ����
      if(total >= 90) {		// ������ 90�� �̻��̸�
         totalGrade = "A";					// ������ A�̴�
      }else if(total < 90 && total >= 80) {	// ������ 90�� �̸� 80�� �̻��̸�
         totalGrade = "B";					// ������ B�̴�
      }else if(total < 80 && total >= 70) {	// ������ 80�� �̸� 70�� �̻��̸�
         totalGrade = "C";					// ������ C�̴� 
      }else if(total < 70 && total >= 60) {	// ������ 70�� �̸� 60�� �̻��̸�
         totalGrade = "D";					// ������ D�̴�
      }else {								// �� ���� �������̶��
         totalGrade = "F";					// ������ F�̴�
      }
      return totalGrade;					// ������ ��ȯ
   }
   
   public String getStuName() {		// �л��̸��� ��ȯ���ִ� �޼ҵ��� �Ӹ���
      return StuName;				// �л��̸��� ��ȯ����
   }
   
   public int getHomework() {		// ���������� ��ȯ���ִ� �޼ҵ��� �Ӹ���
      return HomeGrade;				// ���������� ��ȯ����
   }
   
   public int getTest() {			// ���������� ��ȯ���ִ� �޼ҵ��� �Ӹ���
      return TestGrade;				// ���������� ��ȯ����
   }
   
   public void print() {			// �� ����� ������ִ� �޼ҵ��� �Ӹ���
         System.out.println(getStuName() + "�� ������" + getTotal() + "�̰� ������ " + getGrade(getTotal()) + "�̴�."); // StuName "�� ������"getTotal()"�̰� ������ "getGrade(getTotal())"�̴�." �������
   }
}
