/* A class for comparing movies by IMDb score 
*/

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
	// 0 if the same,   sonra geliyorsa pozitif, once geliyorsa negatif.
	public int compareTo(MovieScore that) {
		return(String.valueOf(this.score).compareTo(String.valueOf(that.score)));
	}

	public static void main(String[] args) {
		MovieScore movie = new MovieScore("Alien", 3.0);
		MovieScore mov = new MovieScore("Armageddon", 4.0);
		System.out.println(movie.getTitle() + ", " + movie.getScore());
		System.out.println(movie.compareTo(mov));
	}
}