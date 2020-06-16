import java.util.*;
public class DoWhileTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input;
		int answer=77;
		
		do {
			System.out.print("숫자를 추측: ");
			input = s.nextInt();
			if(input > answer) {
				System.out.println("입력한 숫자가 정답보다 큽니다");
			}
			else if(input < answer){
				System.out.println("입력한 숫자가 정답보다 작습니다");
			}
		}while(input != answer);
		
		System.out.println("정답입니다!");
		s.close();
	}

}
