import java.util.*;
// 1~12 ������ ���� �Է¹޾� ��, ����, ���� �ܿ��� �Ǵ�
public class CaseEx {
	public static void main(String[] args) {
		int month;
		Scanner s = new Scanner(System.in);
		System.out.print("��(1~12 �Է��ϼ��� : ");
		month = s.nextInt();
		
		switch(month) {
		case 12:
		case 1:
		case 2:
			System.out.println("�ܿ��Դϴ�.");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("���Դϴ�.^^");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("�����Դϴ�.~~");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("�����Դϴ�.-_-");
			break;
		default:
			System.out.println("�߸��� �Է�--;");
		}
		s.close();
	}
}
