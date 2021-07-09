package com.api.marvel.dto.marvel;

import java.util.ArrayList;

public class CharacterList {

	private Integer available;
	private Integer returned;
	private String collectionURI;
	private ArrayList<CharacterSummary> items;
	public Integer getAvailable() {
		return available;
	}
	public Integer getReturned() {
		return returned;
	}
	public String getCollectionURI() {
		return collectionURI;
	}
	public ArrayList<CharacterSummary> getItems() {
		return items;
	}
	
	
	
}
