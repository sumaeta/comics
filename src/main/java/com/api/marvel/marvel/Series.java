package com.api.marvel.marvel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Series {

	@JsonProperty("resourceURI")
	private String resourceURI;
	
	@JsonProperty("name")
    private String name;

    public String getResourceURI() { return resourceURI; }
    public void setResourceURI(String value) { this.resourceURI = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }
}
