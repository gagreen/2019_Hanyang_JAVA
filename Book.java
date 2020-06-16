
public class Book {
	String title, author;
	
	public Book(String title) {
		this.title = title;
		this.author = "작가 미상";
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	public static void main(String[] args) {
		Book one = new Book("크리스마스캐럴");
		System.out.println(one.title+", "+one.author);
		Book two = new Book("어린왕자", "생텍쥐페리");
		System.out.println(two.title+", "+two.author);
	}	

}
