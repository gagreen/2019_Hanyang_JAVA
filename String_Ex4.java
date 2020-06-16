
public class String_Ex4 {

	public static void main(String[] args) {
		String a = new String(" C#");
		String b = new String(", C++");
		System.out.println(a + "의 길이는 " + a.length());
		System.out.println(a.contains("#"));
		
		a = a.concat(b);
		System.out.println(a);
		
		a = a.trim();
		System.out.println(a);
		
		a = a.replace("C#", "JAVA");
		System.out.println(a);
	}

}