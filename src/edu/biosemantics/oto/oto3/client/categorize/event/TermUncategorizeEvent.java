package edu.biosemantics.oto.oto3.client.categorize.event;

import java.util.List;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;

import edu.biosemantics.oto.oto3.client.categorize.event.TermUncategorizeEvent.TermUncategorizeHandler;
import edu.biosemantics.oto.oto3.shared.model.Category;
import edu.biosemantics.oto.oto3.shared.model.Term;

public class TermUncategorizeEvent extends GwtEvent<TermUncategorizeHandler> {

	public interface TermUncategorizeHandler extends EventHandler {
		void onUncategorize(List<Term> terms, Category oldCategory);
	}
	
    public static Type<TermUncategorizeHandler> TYPE = new Type<TermUncategorizeHandler>();
    
    private List<Term> terms;

	private Category oldCategory;
    
    public TermUncategorizeEvent(List<Term> terms, Category oldCategory) {
        this.terms = terms;
        this.oldCategory = oldCategory;
    }
	
	@Override
	public Type<TermUncategorizeHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(TermUncategorizeHandler handler) {
		handler.onUncategorize(terms, oldCategory);
	}

	public List<Term> getTerms() {
		return terms;
	}

	public Category getOldCategory() {
		return oldCategory;
	}
	
	

}
