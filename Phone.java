import java.util.*;

public class Phone {
	public String name, tel;
	
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	public String getName() {
		return name;
	}
	
	public String getTel() {
		return tel;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name, tel;
		System.out.print("이름과 전화번호 입력>> ");
		name = s.next();
		tel = s.next();
		Phone p1 = new Phone(name, tel);
		System.out.print("이름과 전화번호 입력>> ");
		name = s.next();
		tel = s.next();
		Phone p2 = new Phone(name, tel);
		System.out.println(p1.getName() +" "+ p1.getTel());
		System.out.println(p2.getName() +" "+ p2.getTel());
		
		s.close();
	}

}
