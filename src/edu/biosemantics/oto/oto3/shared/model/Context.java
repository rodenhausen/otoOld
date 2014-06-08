package edu.biosemantics.oto.oto3.shared.model;

public class Context {

	private String source;
	private String sentence;
	
	
	
	public Context(String source, String sentence) {
		super();
		this.source = source;
		this.sentence = sentence;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getSentence() {
		return sentence;
	}
	public void setSentence(String sentence) {
		this.sentence = sentence;
	}
	
	
	
}


