import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		String name;
		int num;
		String name2;
		Scanner s = new Scanner(System.in);
		
		System.out.print("���� �����ϴ� �׷��: ");
		name = s.next();
		System.out.print("�� ���: ");
		num = s.nextInt();
		System.out.print("���� ���� �����ϴ� �����?: ");
		name2 = s.next();
		System.out.println(name + " " + num + " " + name2);
		
		s.close();
	}

}
