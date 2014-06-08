package edu.biosemantics.oto.oto3.shared.model;

public abstract class TextTreeNode implements Comparable<TextTreeNode> {

	public abstract String getText();
	
	@Override
	public int compareTo(TextTreeNode o) {
		return this.getText().compareTo(o.getText());
	}
	
}