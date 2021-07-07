package com.api.marvel.marvel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {

		@JsonProperty("offset")
	    private String offset;
		
		@JsonProperty("limit")
	    private String limit;
		
		@JsonProperty("total")
	    private String total;
		
		@JsonProperty("count")
	    private String count;

	    public String getOffset() { return offset; }
	    public void setOffset(String value) { this.offset = value; }

	    public String getLimit() { return limit; }
	    public void setLimit(String value) { this.limit = value; }

	    public String getTotal() { return total; }
	    public void setTotal(String value) { this.total = value; }

	    public String getCount() { return count; }
	    public void setCount(String value) { this.count = value; }
	    
	    private Results results;

		public Results getResults() {
			return results;
		}
		public void setResults(Results results) {
			this.results = results;
		}
	    
	    
}