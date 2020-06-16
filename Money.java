import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("액수를 입력하세요>>");
		int money = scanner.nextInt();
		System.out.print("오만원 "+money/50000+"개, ");
		money = money - (money/50000)*50000;
		
		System.out.print("만원 "+money/10000+"개, ");
		money = money - (money/10000)*10000;

		System.out.print("천원 "+money/1000+"개,");
		money = money - (money/1000)*1000;
		
		System.out.print("오백원 "+money/500+"개, ");
		money = money - (money/500)*500;
		
		System.out.print("백원 "+money/100+"개, ");
		money = money - (money/100)*100;
		
		System.out.print("십원 "+money/10+"개, ");
		money = money - (money/10)*10;
		
		System.out.println("일원 "+money/1+"개");
		
		scanner.close();
	}

}
