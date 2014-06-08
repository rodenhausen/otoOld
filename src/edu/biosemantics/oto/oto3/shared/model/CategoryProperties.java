package edu.biosemantics.oto.oto3.shared.model;

import java.util.List;

import com.google.gwt.editor.client.Editor.Path;
import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.data.shared.LabelProvider;
import com.sencha.gxt.data.shared.ModelKeyProvider;
import com.sencha.gxt.data.shared.PropertyAccess;

public interface CategoryProperties extends PropertyAccess<Category> {

	  @Path("text")
	  ModelKeyProvider<Category> key();
	   
	  @Path("text")
	  LabelProvider<Category> nameLabel();
	 
	  ValueProvider<Category, String> text();
	   
	  ValueProvider<Category, String> description();
	  
	  ValueProvider<Category, List<Term>> terms();
	
}
