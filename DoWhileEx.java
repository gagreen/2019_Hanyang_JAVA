import java.util.*;
public class DoWhileEx {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input;
		System.out.println("메세지를 입력하세요!\n종료하려면 q를 입력");
		do {
			System.out.print(">");
			input = s.next();
			System.out.println(input);
		}while(!input.equals("q"));
		System.out.println("프로그램 종료");
		s.close();
	}

}
