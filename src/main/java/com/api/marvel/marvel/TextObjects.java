package com.api.marvel.marvel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TextObjects {

		@JsonProperty("type")
		private String type;
	
		@JsonProperty("language")
	    private String language;
		
		@JsonProperty("text")
	    private String text;

	    public String getType() { return type; }
	    public void setType(String value) { this.type = value; }

	    public String getLanguage() { return language; }
	    public void setLanguage(String value) { this.language = value; }

	    public String getText() { return text; }
	    public void setText(String value) { this.text = value; }
}
