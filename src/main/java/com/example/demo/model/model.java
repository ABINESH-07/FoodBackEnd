package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "FoodList")
public class model {
	
	@Id
	private int sno;
	private String items;
	private int rate;
	private int rating;
	private String time;

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
		public model(int sno, String items, int rate, int rating, String time) {
			super();
			this.sno = sno;
			this.items = items;
			this.rate = rate;
			this.rating = rating;
			this.time = time;
		}
public model() {
		
	}
	
	public String toString() {
		return "sno="+sno+"item="+items+"rate="+rate+"rating="+rating+"time="+time;
	}
}