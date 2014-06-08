package edu.biosemantics.oto.oto3.shared.model;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Term {

	private String text;
	private Category initialCategory;
	private Category category;
	private Set<Term> synonyms = new LinkedHashSet<Term>();
	
	public Term(String text) {
		super();
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Set<Term> getSynonyms() {
		return synonyms;
	}

	public void setSynonyms(Set<Term> synonyms) {
		this.synonyms = synonyms;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Category getInitialCategory() {
		return initialCategory;
	}

	public void setInitialCategory(Category initialCategory) {
		this.initialCategory = initialCategory;
	}

	public void removeSynonym(Term term) {
		synonyms.remove(term);
	}

	public void addSynonym(Term term) {
		synonyms.add(term);
	}
	
}
