package edu.biosemantics.oto.oto3.client;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TabPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.sencha.gxt.core.client.util.Margins;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.container.BorderLayoutContainer;
import com.sencha.gxt.widget.core.client.container.BorderLayoutContainer.BorderLayoutData;
import com.sencha.gxt.widget.core.client.container.Viewport;

import edu.biosemantics.oto.oto3.client.categorize.CategorizeView;
import edu.biosemantics.oto.oto3.shared.model.Category;
import edu.biosemantics.oto.oto3.shared.model.Term;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Oto3 implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		List<Category> initialCategories = getInitialCategories();
		List<Category> categories = getCategories();

		CategorizeView categorizeView = new CategorizeView();
		Viewport v = new Viewport();
		v.add(categorizeView.asWidget());
		RootPanel.get().add(v);

		categorizeView.setCategories(categories);
		categorizeView.setInitialCategories(initialCategories);
	}

	private List<Category> getInitialCategories() {
		List<Category> categories = new LinkedList<Category>();
		Category structures = new Category("structures", "all structures");
		List<Term> terms = new LinkedList<Term>();
		terms.add(new Term("a"));
		terms.add(new Term("b"));
		structures.setTerms(terms);
		
		Category characters = new Category("characters", "all characters");
		terms = new LinkedList<Term>();
		terms.add(new Term("c"));
		terms.add(new Term("d"));
		characters.setTerms(terms);
		
		Category others = new Category("others", "all others");
		terms = new LinkedList<Term>();
		terms.add(new Term("e"));
		terms.add(new Term("f"));
		others.setTerms(terms);
		
		categories.add(structures);
		categories.add(characters);
		categories.add(others);
		
		return categories;
	}

	private List<Category> getCategories() {
		List<Category> categories = new LinkedList<Category>();
		Category abc = new Category("abc", "d");
		List<Term> categoryTerms = new LinkedList<Term>();
		Term term = new Term("aaaa");
		Set<Term> synonyms = new HashSet<Term>();
		synonyms.add(new Term("bbb"));
		synonyms.add(new Term("ccc"));
		term.setSynonyms(synonyms);
		categoryTerms.add(term);
		abc.setTerms(categoryTerms);
		categories.add(abc);
		categories.add(new Category("bcd", "d"));
		categories.add(new Category("efg", "d"));
		categories.add(new Category("bcd", "d"));
		categories.add(new Category("bcd", "d"));
		categories.add(new Category("efg", "d"));
		categories.add(new Category("bcd", "d"));
		categories.add(new Category("bcd", "d"));
		categories.add(new Category("efg", "d"));
		categories.add(new Category("bcd", "d"));
		categories.add(new Category("bcd", "d"));
		categories.add(new Category("efg", "d"));
		categories.add(new Category("bcd", "d"));
		categories.add(new Category("bcd", "d"));
		categories.add(new Category("efg", "d"));
		categories.add(new Category("bcd", "d"));
		categories.add(new Category("bcd", "d"));
		categories.add(new Category("efg", "d"));
		categories.add(new Category("bcd", "d"));
		return categories;
	}
}
