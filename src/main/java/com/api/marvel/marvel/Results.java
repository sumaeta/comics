package com.api.marvel.marvel;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Results {
	
		@JsonProperty("id")
	    private String id;
		
		@JsonProperty("idigitalIDd")
	    private String digitalID;
		
		@JsonProperty("title")
	    private String title;
		
		@JsonProperty("issueNumber")
	    private String issueNumber;
		
		@JsonProperty("variantDescription")
	    private String variantDescription;
		
		@JsonProperty("id")
	    private String description;
	    
		@JsonProperty("id")
	    private String modified;
	    
		@JsonProperty("id")
	    private String isbn;
	    
		@JsonProperty("id")
	    private String upc;
	    
		@JsonProperty("id")
	    private String diamondCode;
	    
		@JsonProperty("id")
	    private String ean;
	    
		@JsonProperty("id")
	    private String issn;
	    
		@JsonProperty("id")
	    private String format;
	    
		@JsonProperty("id")
	    private String pageCount;
	    
	    private List<TextObjects> textObjects;
	    
	    @JsonProperty("id")
	    private String resourceURI;
	    
	    private List<Urls> urls;
	    
	    private List<Series> series;
	    
	    private List<Variants> variants;
	    
	    private List<Collections> collections;
	    
	    private List<CollectedIssues> collectedIssues;
	    
	    private List<Dates> dates;
	    
	    private List<Prices> prices;
	    
	    @JsonProperty("id")
	   private Thumbnail thumbnail;
	   
	   private List<Images> images;
	   
	   @JsonProperty("id")
	   private Creators creators;
	   
	   @JsonProperty("id")
	   private Characters characters;
	   
	   @JsonProperty("id")
	   private Stories stories;
	   
	   @JsonProperty("id")
	   private Events events;
	   
	   @JsonProperty("id")
	   private String etag;

	   
	    public String getID() { return id; }
	    public void setID(String value) { this.id = value; }

	    public String getDigitalID() { return digitalID; }
	    public void setDigitalID(String value) { this.digitalID = value; }

	    public String getTitle() { return title; }
	    public void setTitle(String value) { this.title = value; }

	    public String getIssueNumber() { return issueNumber; }
	    public void setIssueNumber(String value) { this.issueNumber = value; }

	    public String getVariantDescription() { return variantDescription; }
	    public void setVariantDescription(String value) { this.variantDescription = value; }

	    public String getDescription() { return description; }
	    public void setDescription(String value) { this.description = value; }

	    public String getModified() { return modified; }
	    public void setModified(String value) { this.modified = value; }

	    public String getIsbn() { return isbn; }
	    public void setIsbn(String value) { this.isbn = value; }

	    public String getUpc() { return upc; }
	    public void setUpc(String value) { this.upc = value; }

	    public String getDiamondCode() { return diamondCode; }
	    public void setDiamondCode(String value) { this.diamondCode = value; }

	    public String getEan() { return ean; }
	    public void setEan(String value) { this.ean = value; }

	    public String getIssn() { return issn; }
	    public void setIssn(String value) { this.issn = value; }

	    public String getFormat() { return format; }
	    public void setFormat(String value) { this.format = value; }

	    public String getPageCount() { return pageCount; }
	    public void setPageCount(String value) { this.pageCount = value; }
	    
	    public String getResourceURI() { return resourceURI; }
	    public void setResourceURI(String value) { this.resourceURI = value; }
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public List<TextObjects> getTextObjects() {
			return textObjects;
		}
		public void setTextObjects(List<TextObjects> textObjects) {
			this.textObjects = textObjects;
		}
		public List<Urls> getUrls() {
			return urls;
		}
		public void setUrls(List<Urls> urls) {
			this.urls = urls;
		}
		public List<Series> getSeries() {
			return series;
		}
		public void setSeries(List<Series> series) {
			this.series = series;
		}
		public List<Variants> getVariants() {
			return variants;
		}
		public void setVariants(List<Variants> variants) {
			this.variants = variants;
		}
		public List<Collections> getCollections() {
			return collections;
		}
		public void setCollections(List<Collections> collections) {
			this.collections = collections;
		}
		public List<CollectedIssues> getCollectedIssues() {
			return collectedIssues;
		}
		public void setCollectedIssues(List<CollectedIssues> collectedIssues) {
			this.collectedIssues = collectedIssues;
		}
		public List<Dates> getDates() {
			return dates;
		}
		public void setDates(List<Dates> dates) {
			this.dates = dates;
		}
		public List<Prices> getPrices() {
			return prices;
		}
		public void setPrices(List<Prices> prices) {
			this.prices = prices;
		}
		public Thumbnail getThumbnail() {
			return thumbnail;
		}
		public void setThumbnail(Thumbnail thumbnail) {
			this.thumbnail = thumbnail;
		}
		public List<Images> getImages() {
			return images;
		}
		public void setImages(List<Images> images) {
			this.images = images;
		}
		public Creators getCreators() {
			return creators;
		}
		public void setCreators(Creators creators) {
			this.creators = creators;
		}
		public Characters getCharacters() {
			return characters;
		}
		public void setCharacters(Characters characters) {
			this.characters = characters;
		}
		public Stories getStories() {
			return stories;
		}
		public void setStories(Stories stories) {
			this.stories = stories;
		}
		public Events getEvents() {
			return events;
		}
		public void setEvents(Events events) {
			this.events = events;
		}
		public String getEtag() {
			return etag;
		}
		public void setEtag(String etag) {
			this.etag = etag;
		}
	    
	    
}
