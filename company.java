/*�� ���α׷��� ȸ���� �Ի� ���� ����� ���θ� �������� ������ TOEIC ������ ���� �����Ͽ� ����ϴ� ���α׷��̴�.*/

package company;

import java.util.Scanner;            // �Ի� �����ڵ��� ������ TOEIC ������ �޾Ƴ��� ���� util ��Ű���� Scanner Ŭ������ �������ݴϴ�.

public class company {								// Ŭ������ �Ӹ���
	public static void main(String [] args) { 		// �޼ҵ��� �Ӹ���
		double grade;		// ������ ������ ����									
		int t_sc;			// TOEIC ������ ������ ����
		
		Scanner scan = new Scanner(System.in);   		// Scanner ��ü�� �����ϰ� scan�� �� ��ü�� ����Ű�� ��.
		
		
		System.out.print("������ �Է��ϼ���.");				// "������ �Է��ϼ���"�� ���
		grade = scan.nextDouble();						// grade ������ �Է��� ������ �����Ѵ�.
		System.out.print("TOEIC ������ �Է��ϼ���.");		// "TOEIC ������ �Է��ϼ���."�� ���
		t_sc = scan.nextInt();							// t_sc ������ �Է��� ���������� �����Ѵ�.
		
		if(4.0 <= grade && 700 <= t_sc) {  						// ���࿡ grade(����)�� 4.0 �̻��̰� t_sc(��������)�� 700�� �̻��̸�
			System.out.println("���� ������Դϴ�.");				// "���� ������Դϴ�."�� ����Ѵ�.
		}
		else if(3.5 <= grade && 4.0 > grade && 700 <= t_sc) {	// ���࿡ grade(����)�� 3.5 �̻� 4.0 �̸��̰� t_sc(��������)�� 700�� �̻��̸�
			System.out.println("���� ���� ������Դϴ�.");				// "���� ���� ������Դϴ�."�� ���
		}
		else if(3.0 <= grade && 3.5 > grade && 700 <= t_sc) {	// ���࿡ grade(����)�� 3.0 �̻� 3.5 �̸��̰� t_sc(��������)�� 700�� �̻��̸�
			System.out.println("�ʱ� ���� ������Դϴ�.");				// "�ʱ� ���� ������Դϴ�."�� ���
		}
		else if(3.0 > grade || 700 > t_sc) {					// ���࿡ grade(����)�� 3.0 �̸��̰ų� t_sc(��������)�� 700�� �̸��̸�	
			System.out.println("������ �� �����ϴ�.");				// "������ �� �����ϴ�."�� ���
		}
	}
}
