import java.util.*;		// util ��Ű���� Ŭ������ ��������

public class Pet {		// PetŬ������ �Ӹ���
	String name;	// �̸��� �޴� ����
	int age;		// ���̸� �޴� ����

	public Pet(String Name,int Age) {	// PetŬ������ �������� �Ӹ���
		name = Name;		// �̸��� �Ű����� Name���� ����
		age = Age;			// ���̸� �Ű����� Age�� ����
	}

	public String getName() {	// getName�޼ҵ��� �Ӹ���
		return name;		// name�� ��ȯ
	}

	public void setName(String name) {		// setName�޼ҵ��� �Ӹ���
		this.name = name;		// Ŭ���� ���� name�� �Ű����� name���� ����
	}

	public int getAge() {		// getAge�޼ҵ��� �Ӹ���
		return age;			// age�� ��ȯ
	}	

	public void setAge(int age) {		// setAge�޼ҵ��� �Ӹ���
		this.age = age;		// Ŭ���� ���� age�� �Ű����� age�� ����
	}
	
	public String petTotal() {		// petTotal�޼ҵ��� �Ӹ���
		return "�̸�: "+name+"  ����: "+age;		// "�̸�: "+name+"  ����: "+age�� ��ȯ
	}
	
	public void print() {		// print�޼ҵ��� �Ӹ���
		System.out.println("�̸�: "+name);	// "�̸�: "+name �� ���
		System.out.println("����: "+age);		// "����: "+age �� ���
	}
}
