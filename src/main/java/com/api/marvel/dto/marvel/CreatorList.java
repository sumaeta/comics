package com.api.marvel.dto.marvel;

import java.util.List;

public class CreatorList {

	private Integer available;
	private Integer returned;
	private String collectionURI;
	private List<CreatorSummary> items;
	
	public Integer getAvailable() {
		return available;
	}
	public Integer getReturned() {
		return returned;
	}
	public String getCollectionURI() {
		return collectionURI;
	}
	public List<CreatorSummary> getItems() {
		return items;
	}

	
}
