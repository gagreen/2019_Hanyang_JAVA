import java.util.*;
public class ArithmeticOperato {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input;
		int second, minute, hours;
		System.out.print("�� �Է�: ");
		input = s.nextInt();
		System.out.print(input + "�ʴ�");
		hours = input / (60 * 60);
		if(hours != 0) {
			input = input % (hours * 60 * 60);
		}
		minute = input / 60;
		if(minute != 0) {
			input = input % (minute * 60);
		}
		second = input;
		System.out.println(hours+"�ð�, "+minute+"��, "+second+"���Դϴ�.");
		s.close();
		
	}

}
