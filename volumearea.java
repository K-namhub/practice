/*�� ���α׷��� ������� �������� ���̸� 1~10�翡 ������ �������� �޾� ���ǿ� ǥ������ ����ϴ� ���α׷��Դϴ�.*/

package volumearea;
import java.util.Random;                	 //������� �������� ���̸� �������� �ޱ����� util ��Ű����  RandomŬ������ �������ݴϴ�.

public class volumearea {					 //�������� ���� �ް� ���ǿ� ǥ������ ����Ͽ� ������ִ� Ŭ���� �Ӹ���
	
	public static void main(String[] args) { //main �޼ҵ� �Ӹ���
		final double PI = 3.14159;			//PI�� ���� ������ �ֱ� ������ 3.14159�� �̸� ������.
		int radius;							//���� ������ ����
		int height;							//������� ���� ����
		double volume;						//������� ���� ����	
		double area;						//������� ǥ���� ����
	
		
		Random ran = new Random();    		                //Random ��ü�� �����ϰ� ran�� �� ��ü�� ����Ű�� ��.
	
		radius = ran.nextInt(10)+1;							//ran�� 0~9���� 10���� ������ �������� ���� �ְ���. ������ radius�� 1~10 ������ �����̱� ������ +1�� ����.
		height = ran.nextInt(10)+1;							//ran�� 0~9���� 10���� ������ �������� ���� �ְ���. ������ height�� 1~10 ������ �����̱� ������ +1�� ����.
		
		volume = PI*radius*radius*height;					//volume ������ ������� ���� ������ �����Ͽ� ���� ��������.
		area = 2*PI*radius*height+2*PI*radius*radius;		//area ������ ������� ǥ���� ������ �����Ͽ� ���� ��������.
		
		System.out.println("������ = " + radius);				//���� �������� ���� ���
		System.out.println("���� = " + height);				//������� ���� ���� ���
		System.out.println("���� = " + volume);				//������� ���ǰ��� ���
		System.out.println("ǥ���� = " + area);				//������� ǥ�������� ���
	}

}
