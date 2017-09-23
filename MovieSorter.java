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

   		//Setting the arguments manually so that I can easily run this in Eclipse
   		args=new String[2];
   		args[0]="Data/movie_title_score.random.csv";
   		args[1]="15000";
   		System.out.println("Sorting "+args[1]+" movies from "+args[0]);
   		
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
		Selection.sort(movies);
		double time = stopwatch.elapsedTime();
		System.out.println("Sort took "+time+" seconds!");
		System.out.println(time);
	}

}