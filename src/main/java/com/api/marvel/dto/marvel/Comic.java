package com.api.marvel.dto.marvel;

import java.util.ArrayList;

public class Comic {

	private Integer id;
	private Integer digitalId;
	private String title;
	private Double issueNumber;
	private String variantDescription ;
	private String description;
	private String modified;
	private String isbn;
	private String upc;
	private String diamondCode;
	private String ean;
	private String issn;
	private String format;
	private Integer pageCount;
	private ArrayList<TextObject> textObjects;
	private String resourceURI;
	private ArrayList<Url> urls;
	private SeriesSummary series;
	private ArrayList<ComicSummary> variants;
	private ArrayList<ComicSummary> collections;
	private ArrayList<ComicSummary> collectedIssues;
	private ArrayList<ComicDate> dates;
	private ArrayList<ComicPrice> prices;
	private Image thumbnail;
	private ArrayList<Image> images;
	private CreatorList creators;
	private CharacterList characters;
	private StoryList stories;
	private EventList events;
	
	public Integer getId() {
		return id;
	}
	public Integer getDigitalId() {
		return digitalId;
	}
	public String getTitle() {
		return title;
	}
	public Double getIssueNumber() {
		return issueNumber;
	}
	public String getVariantDescription() {
		return variantDescription;
	}
	public String getDescription() {
		return description;
	}
	public String getModified() {
		return modified;
	}
	public String getIsbn() {
		return isbn;
	}
	public String getUpc() {
		return upc;
	}
	public String getDiamondCode() {
		return diamondCode;
	}
	public String getEan() {
		return ean;
	}
	public String getIssn() {
		return issn;
	}
	public String getFormat() {
		return format;
	}
	public Integer getPageCount() {
		return pageCount;
	}
	public ArrayList<TextObject> getTextObjects() {
		return textObjects;
	}
	public String getResourceURI() {
		return resourceURI;
	}
	public ArrayList<Url> getUrls() {
		return urls;
	}
	public SeriesSummary getSeries() {
		return series;
	}
	public ArrayList<ComicSummary> getVariants() {
		return variants;
	}
	public ArrayList<ComicSummary> getCollections() {
		return collections;
	}
	public ArrayList<ComicSummary> getCollectedIssues() {
		return collectedIssues;
	}
	public ArrayList<ComicDate> getDates() {
		return dates;
	}
	public ArrayList<ComicPrice> getPrices() {
		return prices;
	}
	public Image getThumbnail() {
		return thumbnail;
	}
	public ArrayList<Image> getImages() {
		return images;
	}
	public CreatorList getCreators() {
		return creators;
	}
	public CharacterList getCharacters() {
		return characters;
	}
	public StoryList getStories() {
		return stories;
	}
	public EventList getEvents() {
		return events;
	}
	
	
	
}
