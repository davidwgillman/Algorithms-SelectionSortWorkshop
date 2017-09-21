/* Uses SelectionSort to sort N movies from a file by IMDb score,
   and reports the time.
   Usage:  MovieSorter <filename> <number>
*/
import java.lang.Throwable;
import edu.princeton.cs.algs4.Stopwatch;
import edu.princeton.cs.algs4.Selection;

class MovieSorter {
	public static void main(String[] args) {
		int N = 0;
   		MovieScore[] movies = null;

		// parse the arguments
		String filename = args[0];

		try {
			N = Integer.parseInt(args[1]);
	    	MovieScoreArrayReader ar = new MovieScoreArrayReader(filename);
    		movies = ar.read(N);    
    	} catch (Throwable e) {
    		System.out.println("Error building movie array.");
    	}		

		Stopwatch stopwatch = new Stopwatch();
		// insert code
		/* Accidentally did Insertion
		for (int i=0; i < movies.length; i++) {
			for (int j = i-1; j >= 0; j--) {
				if (movies[i].compareTo(movies[j]) < 0) {
					MovieScore temp = movies[j];
					movies[j] = movies[i];
					movies[i] = movies[j];
				}
			}
		}
		*/
		
		for (int i=0; i < movies.length; i++) {
			MovieScore loser = new MovieScore("The Best Movie Ever", 11.0);
			int loserint = 0;
			for (int j = i; j < movies.length; j++) {
				if (movies[j].compareTo(loser) < 0) {
					loser = movies[j];
					loserint = j;
				}
			}
			movies[loserint] = movies[i];
			movies[i] = loser;
		}
		double time = stopwatch.elapsedTime();
		System.out.println(time);
		/*
		for (int i2=0; i2 < movies.length; i2++) {
			System.out.println(movies[i2]);
		}
		*/
	}

}