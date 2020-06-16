import java.util.*;
public class Balance {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=1, money=0, inputMoney;
		System.out.println("---------------------");
		while(n != 4) {
			
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("---------------------");
			System.out.print("선택>");
			n = s.nextInt();
			switch (n) {
				case 1:
					System.out.print("예금액>");
					inputMoney = s.nextInt();
					money += inputMoney;
					break;
				case 2:
					System.out.print("출글액>");
					inputMoney = s.nextInt();
					money -= inputMoney;
					break;
				case 3:
					System.out.println("잔고>" + money);
					break;
			}
		}
		System.out.println("프로그램 종룡");
		s.close();
	}

}
