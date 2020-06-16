import java.util.*;

public class BookArray {
	String title, author;
	
	public BookArray(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public static void main(String[] args) {
		String title, author;
		Scanner s = new Scanner(System.in);
		
		BookArray [] b = new BookArray[2];
		for(int i=0; i<b.length; i++) {
			System.out.print("제목>>");
			title = s.nextLine();
			System.out.print("저자>>");
			author = s.nextLine();
			b[i] = new BookArray(title, author);
		}
		for(int i=0; i<b.length; i++) {
			System.out.println("("+b[i].title+", "+b[i].author+")");
		}
		
		s.close();
	}
}
