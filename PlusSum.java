import java.util.Scanner;

public class PlusSum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum=0;
		int input;
		System.out.print("���� 5�� �Է�: ");
		for (int i=0; i<5; i++) {
			input = s.nextInt();
			if(input < 0) {
				continue;
			}
			sum += input;
		}
		System.out.println("����� ���� "+sum);
		
		s.close();
	}

}
