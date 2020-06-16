import java.util.*;
// 1~12 사이의 월을 입력받아 봄, 여름, 가을 겨울을 판단
public class CaseEx {
	public static void main(String[] args) {
		int month;
		Scanner s = new Scanner(System.in);
		System.out.print("월(1~12 입력하세요 : ");
		month = s.nextInt();
		
		switch(month) {
		case 12:
		case 1:
		case 2:
			System.out.println("겨울입니다.");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("봄입니다.^^");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름입니다.~~");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을입니다.-_-");
			break;
		default:
			System.out.println("잘못된 입력--;");
		}
		s.close();
	}
}
