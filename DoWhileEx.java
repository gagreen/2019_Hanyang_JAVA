import java.util.*;
public class DoWhileEx {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input;
		System.out.println("�޼����� �Է��ϼ���!\n�����Ϸ��� q�� �Է�");
		do {
			System.out.print(">");
			input = s.next();
			System.out.println(input);
		}while(!input.equals("q"));
		System.out.println("���α׷� ����");
		s.close();
	}

}
