import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�� ������ �Է��ϼ���>>");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println(a+"+"+b+"�� "+(a+b));
		scanner.close();
	}
}
