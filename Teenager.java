import java.util.*;

public class Teenager {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int age;
		
		System.out.print("���� �Է�: ");
		age = s.nextInt();
		
		if(age < 20 && age>=10) {
			System.out.println("10��� �ູ�ؿ�");
		}
		else {
			System.out.println("�׸�����");
		}
		s.close();
	}

}
