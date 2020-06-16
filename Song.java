
public class Song {
	String title;
	
	public Song(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public static void main(String[] args) {
		Song mySong1 = new Song("»ç°è");
		Song mySong2 = new Song("º¢²É¿£µù");
		
		System.out.println("¿äÁò ³ë·¡: " + mySong1.getTitle());
		System.out.println("º½ ³ë·¡: " + mySong2.getTitle());
	}

}
