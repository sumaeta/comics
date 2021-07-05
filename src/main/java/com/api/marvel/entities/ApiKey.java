package com.api.marvel.entities;

public class ApiKey {

	Comics id;
	
	String url = "https://gateway.marvel.com/v1/public/comics";
	String ts = "1625417799";
	String apiKey = "cd5e3408e8d647534f2c202635620ba9";
	String hash = "f8353910e6768293edb183c8cbd0803a";
	String comicId = id.getComicsId();
	
	@Override
	public String toString() {
		return "ApiKey [url=" + url + ", ts=" + ts + ", apiKey=" + apiKey + ", hash=" + hash + ", comicId=" + comicId
				+ "]";
	}
	
	
	
}
