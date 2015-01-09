package com.bytebybyte.gwt.jquery.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface JQueryLibClientBundle extends ClientBundle {

	public final static JQueryLibClientBundle INSTANCE = GWT.create(JQueryLibClientBundle.class);

	@Source("jquery/jquery-2.1.3.min.js")
	TextResource jquery();

}
