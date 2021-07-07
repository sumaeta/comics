package com.api.marvel.dto;

import com.api.marvel.marvel.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MarvelDto {
	
		@JsonProperty("code")
	 	private String code;
		
		@JsonProperty("status")
	    private String status;
		
		@JsonProperty("copyright")
	    private String copyright;
		
		@JsonProperty("attributionText")
	    private String attributionText;
		
		@JsonProperty("attributionHTML")
	    private String attributionHTML;

		@JsonProperty("data")
	    private Data data;
	    
	    public String getCode() { 
	    	return code; }
	    
	    public void setCode(String value) { 
	    	this.code = value; }

	    public String getStatus() { return status; }
	    
	    public void setStatus(String value) { 
	    	this.status = value; }

	    public String getCopyright() { 
	    	return copyright; }
	    
	    public void setCopyright(String value) { 
	    	this.copyright = value; 
	    	}

	    public String getAttributionText() { 
	    	return attributionText; 
	    	}
	    
	    public void setAttributionText(String value) { 
	    	this.attributionText = value; 
	    	}

	    public String getAttributionHTML() { 
	    	return attributionHTML; 
	    	}
	    
	    public void setAttributionHTML(String value) { 
	    	this.attributionHTML = value; 
	    	}

		public Data getData() {
			return data;
		}

		public void setData(Data data) {
			this.data = data;
		}
	

	    
		public void converteJson(ObjectMapper mapper, String json) throws JsonProcessingException {
			 try {
				mapper.readValue(json, MarvelDto.class);
			} catch (JsonMappingException e) {
				e.printStackTrace();
				System.out.println("Erro em converter para json");
			 
			}
		}
	
	
	
	
	
	
	/*
	private List<String> data = new ArrayList<>(String code, String status, String copyright);
	
	@JsonProperty("id")
    private String id;
	
	@JsonProperty("digitalID")
    private String digitalID;
    
	@JsonProperty("title")
    private String title;
    
	@JsonProperty("issueNumber")
    private String issueNumber;
    
	@JsonProperty("variantDescription")
    private String variantDescription;
    
	@JsonProperty("description")
    private String description;
    
	@JsonProperty("modified")
    private String modified;
    
	@JsonProperty("isbn")
    private String isbn;
    
	@JsonProperty("upc")
    private String upc;
    
	@JsonProperty("diamondCode")
    private String diamondCode;
    
	@JsonProperty("ean")
    private String ean;
    
	@JsonProperty("issn")
    private String issn;
    
	@JsonProperty("format")
    private String format;
    
	@JsonProperty("pageCount")
    private String pageCount;	
	

	public MarvelDto() {
		super();
	}

	public MarvelDto(String id, String digitalID, String title, String issueNumber, String variantDescription,
			String description, String modified, String isbn, String upc, String diamondCode, String ean, String issn,
			String format, String pageCount) {
		this.id = id;
		this.digitalID = digitalID;
		this.title = title;
		this.issueNumber = issueNumber;
		this.variantDescription = variantDescription;
		this.description = description;
		this.modified = modified;
		this.isbn = isbn;
		this.upc = upc;
		this.diamondCode = diamondCode;
		this.ean = ean;
		this.issn = issn;
		this.format = format;
		this.pageCount = pageCount;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
    public String getID() { 
    	return id; 
    }
    
    public void setID(String value) { 
    	this.id = value; 
    }

    public String getDigitalID() { 
    	return digitalID; 
    	}
    
    public void setDigitalID(String value) { 
    	this.digitalID = value; 
    	}

    public String getTitle() { 
    	return title; 
    	}
    
    public void setTitle(String value) { 
    	this.title = value; 
    	}

    public String getIssueNumber() { 
    	return issueNumber; 
    	}
    
    public void setIssueNumber(String value) { 
    	this.issueNumber = value; 
    	}

    public String getVariantDescription() { 
    	return variantDescription; 
    	}
    
    public void setVariantDescription(String value) { 
    	this.variantDescription = value; 
    	}

    public String getDescription() { 
    	return description; 
    	}
    
    public void setDescription(String value) { 
    	this.description = value; 
    	}

    public String getModified() { 
    	return modified; 
    	}
    
    public void setModified(String value) { 
    	this.modified = value; 
    	}

    public String getIsbn() { 
    	return isbn; 
    	}
    
    public void setIsbn(String value) { 
    	this.isbn = value; 
    	}

    public String getUpc() { 
    	return upc; 
    	}
    
    public void setUpc(String value) { 
    	this.upc = value; 
    	}

    public String getDiamondCode() { 
    	return diamondCode; 
    	}
    
    public void setDiamondCode(String value) { 
    	this.diamondCode = value; 
    	}

    public String getEan() { 
    	return ean; 
    	}
    
    public void setEan(String value) { 
    	this.ean = value; 
    	}

    public String getIssn() { 
    	return issn; 
    	}
    
    public void setIssn(String value) { 
    	this.issn = value; 
    	}

    public String getFormat() { 
    	return format; 
    	}
    
    public void setFormat(String value) { 
    	this.format = value; 
    	}

    public String getPageCount() { 
    	return pageCount; 
    	}
    
    public void setPageCount(String value) { 
    	this.pageCount = value; 
    	}
    
    
    public void converteJson(ObjectMapper mapper, String json) throws JsonProcessingException {
		 try {
			mapper.readValue(json, Comics.class);
		} catch (JsonMappingException e) {
			e.printStackTrace();
			System.out.println("Erro ao pegar status da solicitação da proposta");
		 
		}
}

	*/
    
}
		