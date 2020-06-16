import java.util.Scanner;
public class Grading {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int score;
		char grade;
		System.out.print("점수 입력: ");
		score = s.nextInt();
		
		// switch버전
		switch (score/10){
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
		}
		// if버전
//		if(score >= 90) {
//			grade = 'A';
//		}else if(score >= 80) {
//			grade = 'B';
//		}else if(score >= 70) {
//			grade = 'C';
//		}else if(score >= 60) {
//			grade = 'D';
//		}else {
//			grade = 'F';
//		}
		System.out.println("학점은 "+grade);
		s.close();
	}

}
