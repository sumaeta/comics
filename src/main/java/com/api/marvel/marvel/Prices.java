package com.api.marvel.marvel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Prices {

	@JsonProperty("type")
	private String type;
	
	@JsonProperty("price")
    private String price;

    public String getType() { return type; }
    public void setType(String value) { this.type = value; }

    public String getPrice() { return price; }
    public void setPrice(String value) { this.price = value; }
}
