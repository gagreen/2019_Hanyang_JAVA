
public class ScoreAverage {

	public static void main(String[] args) {
		double [][] score = {{3.3, 3.4}, {3.5, 3.6}, {3.7, 4.0},{4.1, 4.2}};
		double sum=0;
		double average;
		for(int year=0; year<score.length; year++) {
			for(int term=0; term<score[year].length; term++) {
				sum += score[year][term];
			}
		}
		average = sum/(score.length*score[0].length);
		System.out.println("4³â ÀüÃ¼ Æò±Õ:" + average);
	}

}
