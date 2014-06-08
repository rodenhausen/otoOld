package edu.biosemantics.oto.oto3.client.categorize.event;

import java.util.List;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.GwtEvent.Type;

import edu.biosemantics.oto.oto3.client.categorize.event.CategorizeMoveTermEvent.CategorizeMoveTermHandler;
import edu.biosemantics.oto.oto3.shared.model.Category;
import edu.biosemantics.oto.oto3.shared.model.Term;

public class CategorizeMoveTermEvent extends GwtEvent<CategorizeMoveTermHandler> {

	public interface CategorizeMoveTermHandler extends EventHandler {
		void onCategorize(List<Term> terms, Category sourceCategory, Category targetCategory);
	}
	
    public static Type<CategorizeMoveTermHandler> TYPE = new Type<CategorizeMoveTermHandler>();
    
    private List<Term> terms;
	private Category sourceCategory;
	private Category targetCategory;
    
    public CategorizeMoveTermEvent(List<Term> terms, Category sourceCategory, Category targetCategory) {
        this.terms = terms;
        this.sourceCategory = sourceCategory;
        this.targetCategory = targetCategory;
    }
	
	@Override
	public Type<CategorizeMoveTermHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(CategorizeMoveTermHandler handler) {
		handler.onCategorize(terms, sourceCategory, targetCategory);
	}

	public List<Term> getTerms() {
		return terms;
	}

	public Category getSourceCategory() {
		return sourceCategory;
	}

	public Category getTargetCategory() {
		return targetCategory;
	}
	
}
