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
        //implement SelectionSort:
        //find the lowest score in the list
        //bring this score to the front position
        //find the lowest score in the list starting from position i+1
        int n = movies.length;
 
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (movies[j].compareTo(movies[min_idx]) == 1)
                    min_idx = j;
            // Swap the found minimum element with the first element
            MovieScore temp = movies[min_idx];
            movies[min_idx] = movies[i];
            movies[i] = temp;
        }
        double time = stopwatch.elapsedTime();
        System.out.println("Elapsed time: " + time);
    }           

}
