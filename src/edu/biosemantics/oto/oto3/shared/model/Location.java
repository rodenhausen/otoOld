package edu.biosemantics.oto.oto3.shared.model;

public class Location {

	private String instance;
	private String categorization;
	public Location(String instance, String categorization) {
		super();
		this.instance = instance;
		this.categorization = categorization;
	}
	
	public String getInstance() {
		return instance;
	}
	public void setInstance(String instance) {
		this.instance = instance;
	}
	public String getCategorization() {
		return categorization;
	}
	public void setCategorization(String categorization) {
		this.categorization = categorization;
	}
	
}
