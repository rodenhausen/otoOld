package edu.biosemantics.oto.oto3.client.categorize.event;

import java.util.List;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;

import edu.biosemantics.oto.oto3.client.categorize.event.TermCategorizeEvent.TermCategorizeHandler;
import edu.biosemantics.oto.oto3.shared.model.Category;
import edu.biosemantics.oto.oto3.shared.model.Term;

public class TermCategorizeEvent extends GwtEvent<TermCategorizeHandler> {

	public interface TermCategorizeHandler extends EventHandler {
		void onCategorize(List<Term> terms, Category category);
	}
	
    public static Type<TermCategorizeHandler> TYPE = new Type<TermCategorizeHandler>();
    
    private List<Term> terms;
	private Category category;
    
    public TermCategorizeEvent(List<Term> terms, Category category) {
        this.terms = terms;
        this.category = category;
    }
	
	@Override
	public Type<TermCategorizeHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(TermCategorizeHandler handler) {
		handler.onCategorize(terms, category);
	}

	public List<Term> getTerms() {
		return terms;
	}

	public Category getCategory() {
		return category;
	}

	
	
}

