import java.util.Scanner;

public class PlusSum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum=0;
		int input;
		System.out.print("정수 5개 입력: ");
		for (int i=0; i<5; i++) {
			input = s.nextInt();
			if(input < 0) {
				continue;
			}
			sum += input;
		}
		System.out.println("양수의 합은 "+sum);
		
		s.close();
	}

}
