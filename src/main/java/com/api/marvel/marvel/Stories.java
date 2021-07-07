package com.api.marvel.marvel;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Stories {

	@JsonProperty("available")
	private String available;
	
	@JsonProperty("returned")
    private String returned;
	
	@JsonProperty("collectionURI")
    private String collectionURI;
    
    private List<Items> items;

    public String getAvailable() { return available; }
    public void setAvailable(String value) { this.available = value; }

    public String getReturned() { return returned; }
    public void setReturned(String value) { this.returned = value; }

    public String getCollectionURI() { return collectionURI; }
    
    public void setCollectionURI(String value) { this.collectionURI = value; }
	
    
    public List<Items> getItems() {
		return items;
	}
	public void setItems(List<Items> items) {
		this.items = items;
	}
    
    
}
