package org.tapestry.example.components;

import org.apache.tapestry5.MarkupWriter;
import org.apache.tapestry5.annotations.Parameter;

public class MyComponent2 {

	@Parameter
	private String name;

	void beginRender(MarkupWriter writer) {
		writer.element("div");
		writer.write("Hello2, " + name);
		writer.end();
	}

}
