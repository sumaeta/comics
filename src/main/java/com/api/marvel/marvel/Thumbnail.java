package com.api.marvel.marvel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Thumbnail {

	@JsonProperty("path")
	private String path;
	
	@JsonProperty("extension")
    private String extension;

    public String getPath() { return path; }
    public void setPath(String value) { this.path = value; }

    public String getExtension() { return extension; }
    public void setExtension(String value) { this.extension = value; }
}
