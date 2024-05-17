package Structure.ch05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MovieRatingSystem {
	
	public static void main(String[] args) {
		// Movie Object 계속 추가하는 자료 구조
		ArrayList<Movie> movies = new ArrayList<Movie>();
		movies.add(new Movie("범죄도시 4",2));
		movies.add(new Movie("기생충",4));
		movies.add(new Movie("택시 드라이버",3));
		movies.add(new Movie("인턴",5));
		
		// for-each 구문 사용
		System.out.println(movies);
		for (Movie movie : movies) {
			System.out.println(movie.getTitle());
		}
		
		for(int i=0; i<movies.size(); i++) {
			System.out.println(movies.get(i).getTitle());
		}
		
		// 어떤 데이터를 정렬을 하려면 정렬 알고리즘을 구현해서
		// 만들어주면 된다.
		// like 버블 정렬, 퀵 정렬 ...
		
		Collections.sort(movies,new Comparator<Movie>() {
			@Override
			public int compare(Movie m1, Movie m2) {
				// TODO Auto-generated method stub
				return Integer.compare(m2.getRating(), m1.getRating());
			}
		});
		System.out.println("---------------");
		for(Movie movie : movies) {
			System.out.println(movie);
		}
		
		
	} // end of main

} // end of class

class Movie {
	private String title; // 영화의 제목 
	private int rating; // 영화의 평점
	
	// 사용자 정의 생성자 (이름, 평점 입력)
	public Movie(String title, int rating) {
		this.title = title;
		this.rating = rating;
	}

	// toString 오버라이딩
	@Override
	public String toString() {
		return "Movie [title=" + title + ", rating=" + rating + "]";
	}

	// getter 메서드 생성 (이름, 평점)
	public String getTitle() {
		return title;
	}

	public int getRating() {
		return rating;
	}
	
}
