import java.util.*;
public class ArithmeticOperato {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input;
		int second, minute, hours;
		System.out.print("초 입력: ");
		input = s.nextInt();
		System.out.print(input + "초는");
		hours = input / (60 * 60);
		if(hours != 0) {
			input = input % (hours * 60 * 60);
		}
		minute = input / 60;
		if(minute != 0) {
			input = input % (minute * 60);
		}
		second = input;
		System.out.println(hours+"시간, "+minute+"분, "+second+"초입니다.");
		s.close();
		
	}

}
