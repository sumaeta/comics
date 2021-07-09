package com.api.marvel.dto.marvel;

import java.util.ArrayList;

public class StoryList {

	private Integer available;
	private Integer returned;
	private String collectionURI;
	private ArrayList<StorySummary> items;
	public Integer getAvailable() {
		return available;
	}
	public Integer getReturned() {
		return returned;
	}
	public String getCollectionURI() {
		return collectionURI;
	}
	public ArrayList<StorySummary> getItems() {
		return items;
	}
	
	
}
