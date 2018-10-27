//Package taskA;

import java.util.ArrayList;


public class Mreview implements Comparable<Mreview> {
	private String title;
	private ArrayList<Integer> ratings;
	
	public Mreview() {
		this.title = "";
		this.ratings = new ArrayList<Integer>();
	}
	
	public Mreview(String ttl) {
		this.title = ttl;
		this.ratings = new ArrayList<Integer>();
	}
	
	public Mreview(String ttl, int firstRating) {
		this.title = ttl;
		this.ratings = new ArrayList<Integer>();
	}
	
	public void addRating(int r) {
		ratings.add(r);
	}
	
	public double aveRating() {
		double aveRating = 0;
		double sum = 0;
		
		if(ratings.size() == 0) {
			aveRating = 0;
		}
		else {
			for(Integer i : ratings) {
				sum += i;
			}
			aveRating = sum / ratings.size();
		}
		return aveRating;
		
	}
	
	@Override
	public int compareTo(Mreview obj) {
		return this.title.compareTo(obj.title);
	}
	
	public boolean equals(Object obj) {
		boolean equalornot;
		equalornot = this.title.equals(((Mreview)obj).title);
		return equalornot;
		
	}
	
	public String getTitle(){
		return title;
		
	}
	
	public int numRatings() {
		int numRatings = ratings.size() + 1;
		return numRatings;
	}
	
	public String toString() {
		return getTitle() + ", average " + aveRating() + " out of " + numRatings() + " ratings";
		
	}
	
}
