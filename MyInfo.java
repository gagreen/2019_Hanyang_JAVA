import java.util.Scanner;

public class MyInfo {
	public static void main(String[] args) {
		System.out.println("�б�, �а�, ����, �̸��� ��ĭ���� �и��Ͽ� ������� �Է��ϼ���");
		Scanner scanner = new Scanner(System.in);
		String school = scanner.next();
		String dept = scanner.next();
		int age = scanner.nextInt();
		String name = scanner.next();
		
		System.out.println("�б��� "+school+"�Դϴ�.");
		System.out.println("�а��� "+dept+"�Դϴ�.");
		System.out.println("���̴� "+age+"�Դϴ�.");
		System.out.println("�̸��� "+name+"�Դϴ�.");
		scanner.close();
	}
}
