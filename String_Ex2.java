
public class String_Ex2 {

	public static void main(String[] args) {
		String s = "Hanyang Technical High School";
		String s1, s2, s3;
		char c;
		c = s.charAt(8);
		s1 = s.toLowerCase();
		s2 = s.toUpperCase();
		s3 = s.concat(" Computer Network!");
		System.out.println("���ڿ� ����: " + s.length());
		System.out.println("���ڿ����� 8��° ����: " + c);
		System.out.println("���ڿ� �빮��: " + s2);
		System.out.println("���ڿ� �ҹ���: " + s1);
		System.out.println("���ڿ� ����: " + s3);

	}

}
