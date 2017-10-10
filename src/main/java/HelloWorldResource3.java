import org.restlet.data.MediaType;

import org.restlet.representation.Representation;
import org.restlet.representation.InputRepresentation;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class HelloWorldResource3 extends ServerResource {

	@Get("xml")
	public Representation represent() {
		return new InputRepresentation(getClass().getResourceAsStream("/hello.xml"), MediaType.APPLICATION_XML);
	}

}