import java.util.*;

public class Teenager {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int age;
		
		System.out.print("나이 입력: ");
		age = s.nextInt();
		
		if(age < 20 && age>=10) {
			System.out.println("10대라서 행복해요");
		}
		else {
			System.out.println("그리워요");
		}
		s.close();
	}

}
