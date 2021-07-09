package com.api.marvel.dto.marvel;

import java.util.ArrayList;

public class ComicDataContainer {

	private Integer offset;
	private Integer limit;
	private Integer total;
	private Integer count;
	private ArrayList<Comic> results;

	public Integer getOffset() {
		return offset;
	}

	public Integer getLimit() {
		return limit;
	}

	public Integer getTotal() {
		return total;
	}

	public Integer getCount() {
		return count;
	}

	public ArrayList<Comic> getResults() {
		return results;
	}
	
	
}
