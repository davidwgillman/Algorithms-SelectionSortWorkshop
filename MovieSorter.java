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
		for(int i = 0; i<movies.length-1; i++) {
          int current = i;
          for(int j = i+1; j<movies.length; j++){
              if (movies[current].compareTo(movies[j]) == 1){
                 current = j;
              }             
          }
            MovieScore temp = movies[current];
            movies[current] = movies[i];
            movies[i] = temp;
        }

		double time = stopwatch.elapsedTime();
	}

}