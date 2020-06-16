
public class String_Ex2 {

	public static void main(String[] args) {
		String s = "Hanyang Technical High School";
		String s1, s2, s3;
		char c;
		c = s.charAt(8);
		s1 = s.toLowerCase();
		s2 = s.toUpperCase();
		s3 = s.concat(" Computer Network!");
		System.out.println("문자열 길이: " + s.length());
		System.out.println("문자열에서 8번째 문자: " + c);
		System.out.println("문자열 대문자: " + s2);
		System.out.println("문자열 소문자: " + s1);
		System.out.println("문자열 결합: " + s3);

	}

}
