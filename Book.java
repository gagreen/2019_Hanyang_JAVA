
public class Book {
	String title, author;
	
	public Book(String title) {
		this.title = title;
		this.author = "�۰� �̻�";
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	public static void main(String[] args) {
		Book one = new Book("ũ��������ĳ��");
		System.out.println(one.title+", "+one.author);
		Book two = new Book("�����", "�������丮");
		System.out.println(two.title+", "+two.author);
	}	

}
