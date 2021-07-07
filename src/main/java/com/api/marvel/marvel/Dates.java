package com.api.marvel.marvel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Dates {

	@JsonProperty("type")
	private String type;
	
	@JsonProperty("date")
    private String date;

    public String getType() { return type; }
    public void setType(String value) { this.type = value; }

    public String getDate() { return date; }
    public void setDate(String value) { this.date = value; }
}
