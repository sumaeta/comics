package com.api.marvel.marvel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Urls {

	@JsonProperty("type")
	private String type;
	
	@JsonProperty("url")
    private String url;

    public String getType() { return type; }
    public void setType(String value) { this.type = value; }

    public String getURL() { return url; }
    public void setURL(String value) { this.url = value; }
	
}
