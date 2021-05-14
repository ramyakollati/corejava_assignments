package assignment3_10;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
class movies {
	String movie_Name;
	String Hero;
	String Villain;
	String Genre;

	public movies(String movie_Name, String hero, String villain, String genre) {
		super();
		this.movie_Name = movie_Name;
		Hero = hero;
		Villain = villain;
		Genre = genre;
	}

	public String getMovie_Name() {
		return movie_Name;
	}

	public void setMovie_Name(String movie_Name) {
		this.movie_Name = movie_Name;
	}

	public String getHero() {
		return Hero;
	}

	public void setHero(String hero) {
		Hero = hero;
	}

	public String getVillain() {
		return Villain;
	}

	public void setVillain(String villain) {
		Villain = villain;
	}

	public String getGenre() {
		return Genre;
	}

	public void setGenre(String genre) {
		Genre = genre;
	}

	@Override
	public String toString() {
		return "movies [movie_Name=" + movie_Name + ", Hero=" + Hero + ", Villain=" + Villain + ", Genre="
				+ Genre + "]";
	}

}

public class movieDetails
{
	public static void main(String[] args) {

		List<movies> movie = Arrays.asList(new movies("bhahibali", "prabhas", "raana", "history"),
				new movies("hi", "arjun", "jagan", "crime"));
				
		Collections.sort(movie, new Comparator<movies>() {

			@Override
			public int compare(movies o1, movies o2) {
				return o1.movie_Name.compareTo(o2.movie_Name);

			}

		});

		printallmovie(movie);
		remove_movie(movie, "hi");

	}

	private static void printallmovie(List<movies> movie) {
		for (movies p : movie)
			System.out.println(p);
	}

	public static void remove_movie(List<movies> movie, String name) {
		movie.remove(name);
	}

}

	

