package org.tapestry.example.services;

import org.apache.tapestry5.SymbolConstants;
import org.apache.tapestry5.ioc.MappedConfiguration;
import org.apache.tapestry5.ioc.ServiceBinder;
import org.tapestry.example.model.management.IDataSource;
import org.tapestry.example.model.management.impl.MockDataSource;

public class AppModule {
	
	 public static void contributeApplicationDefaults(MappedConfiguration<String,String> configuration)
	  {
	    configuration.add(SymbolConstants.SUPPORTED_LOCALES, "en,fr,de");

	  }
	
	public static void bind(ServiceBinder binder) {

        binder.bind(IDataSource.class, MockDataSource.class);
    }

}
