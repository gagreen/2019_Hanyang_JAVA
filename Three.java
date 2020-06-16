import java.util.*;

public class Three {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num;
		
		System.out.print("수를 입력하세요: ");
		num = s.nextInt();
		if(num % 3 == 0) {
			System.out.println("3의 배수입니다.");
		}
		else {
			System.out.println("3의 배수가 아닙니다.");
		}
		
		s.close();
	}

}
