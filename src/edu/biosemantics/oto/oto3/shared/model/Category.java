package edu.biosemantics.oto.oto3.shared.model;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Category {

	private String text;
	private String description;
	private List<Term> terms = new LinkedList<Term>();
	
	public Category(String text, String description) {
		super();
		this.text = text;
		this.description = description;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public List<Term> getTerms() {
		return new LinkedList<Term>(terms);
	}

	public void setTerms(List<Term> terms) {
		for(Term term : terms) 
			term.setInitialCategory(this);
		this.terms = terms;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void removeTerm(Term term) {
		terms.remove(term);
	}
	
	public void addTerm(Term term) {
		terms.add(term);
	}
}