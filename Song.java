
public class Song {
	String title;
	
	public Song(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public static void main(String[] args) {
		Song mySong1 = new Song("���");
		Song mySong2 = new Song("���ɿ���");
		
		System.out.println("���� �뷡: " + mySong1.getTitle());
		System.out.println("�� �뷡: " + mySong2.getTitle());
	}

}
