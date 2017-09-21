/* A class for comparing movies by IMDb score 
*/
import java.lang.*;

public class MovieScore implements Comparable<MovieScore> {
	private final String title;
	private final Double score;

	public MovieScore(String t, Double s) {
		title = t;
		score = s;
	}

	public String getTitle() {
		return title;
	}

	public Double getScore() {
		return score;
	}

	public int compareTo(MovieScore that) {
		if (this.getScore() > that.getScore()) {
			return 1;
		} 
		if (this.getScore() < that.getScore()) {
			return -1;
		} 
		return 0;
	}

	public String toString() {
		return getTitle() +", "+ getScore();
	}

	public static void main(String[] args) {
		MovieScore movie = new MovieScore("Alien", 3.0);
		System.out.println(movie.getTitle() + ", " + movie.getScore());
	}
}