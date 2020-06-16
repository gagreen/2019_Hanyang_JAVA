import java.util.*;
public class Gugudan2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input;
		System.out.print("출력하고자 하는 단 입력: ");
		input = s.nextInt();
		// for version
		for(int i=1; i<10; i++) {
			System.out.println(input+"*"+i+"="+(input*i));
		}
		
		// while version
		int i = 1;
		while(i<10) {
			System.out.println(input+"*"+i+"="+(input*i));
			i++;
		}
		s.close();
	}
}