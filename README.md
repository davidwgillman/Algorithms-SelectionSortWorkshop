# Selection Sort Workshop for Algorithms Fall 2017

__When you run the code, make sure to include the algs4.jar file in the command line, like so: `java -cp algs4.jar:. MovieSorter movie_title_score.sorted.csv 1600`__

Selection Sort was used on three .csv files of movies, ranked by IMDb scores. One file was in random order, another was already sorted, and a third was in reverse sorted order. I implemented the missing code in `MovieScore.java` and `MovieSorter.java` and ran it on the three data sets for N = 2000, 4000, 8000, and 16000, respectively. I then graphed the average runtime vs input (N) for each data set. 

## Random order dataset
![Random order dataset](https://image.ibb.co/hCRuUQ/random_runtime.png)

## Reverse-sorted dataset
![Reverse-sorted dataset](https://image.ibb.co/jVYxik/reversed_runtime.png)

## Sorted dataset
![Sorted dataset](https://image.ibb.co/mNfcik/sorted_runtime.png)
