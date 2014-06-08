package edu.biosemantics.oto.oto3.client.categorize.event;

import java.util.List;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;

import edu.biosemantics.oto.oto3.client.categorize.event.CategorizeCopyTermEvent.CategorizeCopyTermHandler;
import edu.biosemantics.oto.oto3.shared.model.Category;
import edu.biosemantics.oto.oto3.shared.model.Term;

public class CategorizeCopyTermEvent extends GwtEvent<CategorizeCopyTermHandler> {

	public interface CategorizeCopyTermHandler extends EventHandler {
		void onCategorize(List<Term> terms, Category sourceCategory, Category targetCategory);
	}
	
    public static Type<CategorizeCopyTermHandler> TYPE = new Type<CategorizeCopyTermHandler>();
    
    private List<Term> terms;
	private Category sourceCategory;
	private Category targetCategory;
    
    public CategorizeCopyTermEvent(List<Term> terms, Category sourceCategory, Category targetCategory) {
        this.terms = terms;
        this.sourceCategory = sourceCategory;
        this.targetCategory = targetCategory;
    }
	
	@Override
	public Type<CategorizeCopyTermHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(CategorizeCopyTermHandler handler) {
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
