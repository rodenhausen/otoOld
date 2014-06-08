package edu.biosemantics.oto.oto3.shared.model;
public class TermTreeNode extends TextTreeNode {

	private Term term;

	public TermTreeNode(Term term) {
		this.term = term;
	}
	
	@Override
	public String getText() {
		return term.getText();
	}

	public Term getTerm() {
		return term;
	}
	
}