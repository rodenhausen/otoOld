package edu.biosemantics.oto.oto3.shared.model;

import com.google.gwt.editor.client.Editor.Path;
import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.data.shared.LabelProvider;
import com.sencha.gxt.data.shared.ModelKeyProvider;
import com.sencha.gxt.data.shared.PropertyAccess;

public interface LocationProperties extends PropertyAccess<Location> {
  @Path("instance")
  ModelKeyProvider<Location> key();
   
  @Path("instance")
  LabelProvider<Location> nameLabel();
 
  ValueProvider<Location, String> instance();
   
  ValueProvider<Location, String> categorization();
}