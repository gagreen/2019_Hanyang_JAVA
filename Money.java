import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�׼��� �Է��ϼ���>>");
		int money = scanner.nextInt();
		System.out.print("������ "+money/50000+"��, ");
		money = money - (money/50000)*50000;
		
		System.out.print("���� "+money/10000+"��, ");
		money = money - (money/10000)*10000;

		System.out.print("õ�� "+money/1000+"��,");
		money = money - (money/1000)*1000;
		
		System.out.print("����� "+money/500+"��, ");
		money = money - (money/500)*500;
		
		System.out.print("��� "+money/100+"��, ");
		money = money - (money/100)*100;
		
		System.out.print("�ʿ� "+money/10+"��, ");
		money = money - (money/10)*10;
		
		System.out.println("�Ͽ� "+money/1+"��");
		
		scanner.close();
	}

}
