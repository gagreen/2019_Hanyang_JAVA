import java.util.Scanner;

public class Divisor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("���� ���� �Է�: ");
		int n = s.nextInt();
		System.out.print(n+"�� ����� :");
		
		for (int i=1; i <= n/2; i++) {
			if(n%i == 0) {
				System.out.print(i+" ");
			}
		}
		System.out.println(n);
		s.close();
	}

}
