/*�� ���α׷��� ����1�� ����2�� ����-����-���� �Ͽ� �º��� ����� �˷��ִ� ���α׷��Դϴ�.*/


import java.util.Scanner;    // ���� ���� ���� �Է¹ޱ� ���� util ��Ű���� Scanner Ŭ������ �������ش�.

public class RPS {			// Ŭ������ �Ӹ���
	
	public static void main(String [] args) {		// �޼ҵ��� �Ӹ���
		
		String player1;		// ���� 1�� �и� �Է¹ޱ� ���� ����
		String player2;		// ���� 2�� �и� �Է¹ޱ� ���� ����
		
		Scanner scan = new Scanner(System.in);		// Scanner��ü�� �����ϰ� scan�� �� ��ü�� ����Ű�� ��
		
		
		while(true)			// �ݺ����� �������� �����ش�.
		{
			
			System.out.println("���� 1(����, ���� Ȥ�� �� �� ����): ");  // "���� 1(����, ���� Ȥ�� �� �� ����): "�� ���
			player1 = scan.nextLine();							// player1�� ����, ����, �� �� �ϳ��� �Է¹޴´�.
			System.out.println("���� 2(����, ���� Ȥ�� �� �� ����): ");	// "���� 1(����, ���� Ȥ�� �� �� ����): "�� ���		
			player2 = scan.nextLine();							// player2�� ����, ����, �� �� �ϳ��� �Է¹޴´�.
			
				
			if(player1.equals("����")) {     						// player1�� ������ ���� ��
				if(player2.equals("����")) {						// player2�� ������ ���ٸ�
					System.out.println("���� !");				// "���� !"�� ���
				}else if(player2.equals("����")) {				// player2�� ������ ���ٸ�
					System.out.println("���� 2�� �̰�� !"); 		// "���� 2�� �̰�� !"�� ���
					break;										// �ºΰ� ���� ������ �ݺ����� Ż���Ѵ�.
				}else if(player2.equals("��")) {					// player2�� ���� ���ٸ�
					System.out.println("���� 1�� �̰�� !");			// "���� 1�� �̰�� !"�� ���
					break;										// �ºΰ� ���� ������ �ݺ����� Ż���Ѵ�.
				}
			}
		
			if(player1.equals("��")) {							// player1�� ���� ���� ��
				if(player2.equals("��")) {						// player2�� ���� ���ٸ�
					System.out.println("���� !");				// "���� !"�� ���
				}else if(player2.equals("����")) {				// player2�� ������ ���ٸ�
					System.out.println("���� 2�� �̰�� !");			// "���� 2�� �̰�� !"�� ���
					break;										// �ºΰ� ���� ������ �ݺ����� Ż���Ѵ�.
				}else if(player2.equals("����")) {				// player2�� ������ ���ٸ�
					System.out.println("���� 1�� �̰�� !");			// "���� 1�� �̰�� !"�� ���
					break;										// �ºΰ� ���� ������ �ݺ����� Ż���Ѵ�.
				}
			}
		
			if(player1.equals("����")) {							// player1�� ������ ���� ��
				if(player2.equals("����")) {						// player2�� ������ ���ٸ�
					System.out.println("���� !");				// "���� !"�� ���
				}else if(player2.equals("��")) {					// player2�� ���� ���ٸ�
					System.out.println("���� 2�� �̰�� !");			// "���� 2�� �̰�� !"�� ���
					break;										// �ºΰ� ���� ������ �ݺ����� Ż���Ѵ�.
				}else if(player2.equals("����")) {				// player2�� ������ ���ٸ�
					System.out.println("���� 1�� �̰�� !");			// "���� 1�� �̰�� !"�� ���
					break;										// �ºΰ� ���� ������ �ݺ����� Ż���Ѵ�.
				}				
			}
		}

	}
}
