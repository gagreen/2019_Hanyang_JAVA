import java.util.Scanner;

public class MyInfo {
	public static void main(String[] args) {
		System.out.println("학교, 학과, 나이, 이름을 빈칸으로 분리하여 순서대로 입력하세요");
		Scanner scanner = new Scanner(System.in);
		String school = scanner.next();
		String dept = scanner.next();
		int age = scanner.nextInt();
		String name = scanner.next();
		
		System.out.println("학교는 "+school+"입니다.");
		System.out.println("학과는 "+dept+"입니다.");
		System.out.println("나이는 "+age+"입니다.");
		System.out.println("이름는 "+name+"입니다.");
		scanner.close();
	}
}
