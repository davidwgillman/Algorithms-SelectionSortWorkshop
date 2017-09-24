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

	public int compareTo(MovieScore that) {
		// implement this method
        int outcome = 0;
        if (this.getScore() > that.getScore()){
            outcome = 1;
        } else if (this.getScore() < that.getScore()){
            outcome = -1;
        } else if (this.getScore() == that.getScore()){
            outcome = 0;
        }
        return outcome;
	}

	public static void main(String[] args) {
		MovieScore movie = new MovieScore("Alien", 3.0);
		System.out.println(movie.getTitle() + ", " + movie.getScore());
	}
}
