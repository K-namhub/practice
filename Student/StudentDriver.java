/* �� ���α׷��� �л��� �̸��� �ް� ���� ����, ���������� �Է¹޾� �ջ��� ������ ������ �˷��ִ� ���α׷��̴�. */
public class StudentDriver{    // Ŭ������ �Ӹ���
	
	public static void main(String [] args) {// main �޼ҵ��� �Ӹ���
		Student stu1 = new Student();        // Student ��ü�� �����ϰ� �������� stu1�� �� ��ü�� ����Ű�� ��
		Student stu2 = new Student();		 // Student ��ü�� �����ϰ� �������� stu2�� �� ��ü�� ����Ű�� ��
		
		stu1.setStuName("����");		// stu1�� ����Ű�� Student ��ü�� setStuName �޼ҵ带 ȣ��
		stu1.inputGrades(); 	// stu1�� ����Ű�� Student ��ü�� inputGrades �޼ҵ带 ȣ��
		stu1.print();			// stu1�� ����Ű�� Student ��ü�� print �޼ҵ带 ȣ��
		
		stu2.setStuName("����");		// stu2�� ����Ű�� Student ��ü�� setStuName �޼ҵ带 ȣ��
		stu2.inputGrades();		// stu2�� ����Ű�� Student ��ü�� inputGrades �޼ҵ带 ȣ��
		stu2.print();			// stu2�� ����Ű�� Student ��ü�� print �޼ҵ带 ȣ��
		
	}
	
}