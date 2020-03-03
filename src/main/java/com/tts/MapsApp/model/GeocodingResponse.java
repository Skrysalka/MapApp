package com.tts.MapsApp.model;

import java.util.List;

import lombok.Data;

@Data
public class GeocodingResponse {
    private List<Geocoding> results;

	public List<Geocoding> getResults() {
		// TODO Auto-generated method stub
		return results;
	}

	public void setResults(List<Geocoding> results) {
		this.results = results;
	}
	
}