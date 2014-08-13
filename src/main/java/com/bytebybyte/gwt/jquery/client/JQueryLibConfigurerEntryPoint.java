package com.bytebybyte.gwt.jquery.client;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.bytebybyte.gwt.jquery.client.resources.JQueryLibClientBundle;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.ScriptInjector;

public class JQueryLibConfigurerEntryPoint implements EntryPoint {

	protected Logger logger = Logger.getLogger(JQueryLibConfigurerEntryPoint.class.getName());

	@Override
	public void onModuleLoad() {
		JQueryLibClientBundle bundle = JQueryLibClientBundle.INSTANCE;

		logger.log(Level.INFO, "Injecting jquery javascript script element.");

		ScriptInjector.fromString(bundle.jquery().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
	}

}
