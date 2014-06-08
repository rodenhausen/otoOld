package edu.biosemantics.oto.oto3.client.categorize.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;

import edu.biosemantics.oto.oto3.client.categorize.event.TermSelectEvent.TermSelectHandler;
import edu.biosemantics.oto.oto3.shared.model.Term;

public class TermSelectEvent extends GwtEvent<TermSelectHandler> {

	public interface TermSelectHandler extends EventHandler {
		void onSelect(Term term);
	}
	
    public static Type<TermSelectHandler> TYPE = new Type<TermSelectHandler>();
    
    private Term term;
    
    public TermSelectEvent(Term term) {
        this.term = term;
    }
	
	@Override
	public Type<TermSelectHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(TermSelectHandler handler) {
		handler.onSelect(term);
	}

}
