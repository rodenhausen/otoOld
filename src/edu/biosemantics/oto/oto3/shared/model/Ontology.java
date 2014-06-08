package edu.biosemantics.oto.oto3.shared.model;

public class Ontology {

	private String category;
	private String definition;
	
	public Ontology(String category, String definition) {
		super();
		this.category = category;
		this.definition = definition;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDefinition() {
		return definition;
	}
	public void setDefinition(String definition) {
		this.definition = definition;
	}
	
}
